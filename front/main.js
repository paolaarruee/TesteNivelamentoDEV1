const baseApiPath = "http://localhost:8080/eventos";

const eventosTabelaRef = document.getElementById("eventosTabelaRef");
const convidadosTabelaRef = document.getElementById("convidadosTabelaRef");
const tituloEventoInputRef = document.getElementById("tituloEventoInputRef");
const localEventoInputRef = document.getElementById("localEventoInputRef");
const nomeConvidadoInputRef = document.getElementById("nomeConvidadoInputRef");

let listaEventos = [];
let listaConvidados = [];

const atualizaTabelaEventos = () => {
  let conteudoTabela = "";

  if (listaEventos?.length) {
    listaEventos.forEach(
      ({ id, evento, local, nome }, index) =>
        (conteudoTabela += `
      <tr>
        <td>${id}</td>
        <td>${evento}</td>
        <td>${local}</td>
        <td>${nome}</td>
        <td>
          <button type="button" onclick="excluiEvento(${index})">
            Excluir
          </button>
        </td>
      </tr>
    `)
    );
  }

  eventosTabelaRef.innerHTML = conteudoTabela;
};

const atualizaTabelaConvidados = () => {
  let conteudoTabela = "";

  if (listaConvidados?.length) {
    listaConvidados.forEach(
      (nome) => (conteudoTabela += `<tr><td>${nome}</td></tr>`)
    );
  }

  convidadosTabelaRef.innerHTML = conteudoTabela;
};

const getEventos = async () => {
  const eventosRequest = await fetch(`${baseApiPath}/consultarEventos`);
  listaEventos = await eventosRequest.json();
  atualizaTabelaEventos();
};

const limpaFormulário = () => {
  tituloEventoInputRef.value = "";
  localEventoInputRef.value = "";
  nomeConvidadoInputRef.value = "";
  convidadosTabelaRef.innerHTML = "";
  listaConvidados = [];
};

const adicionaConvidado = () => {
  if (nomeConvidadoInputRef.value.trim()) {
    listaConvidados.push(nomeConvidadoInputRef.value);
    atualizaTabelaConvidados();
    nomeConvidadoInputRef.value = "";
  }
};

const cadastraEvento = async (event) => {
  event.preventDefault();

  let convidados = "";

  if (listaConvidados?.length) {
    convidados += '<ul>';
    listaConvidados.forEach(convidado => convidados += `<li>${convidado}</li>`);
    convidados += '</ul>';
  }

  const body = {
    evento: tituloEventoInputRef.value,
    local: localEventoInputRef.value,
    nome: convidados,
    idade: null,
  };

  const headers = {
    Accept: "application/json",
    "Content-Type": "application/json",
  };

  const cadastraEventoReq = await fetch(`${baseApiPath}/cadastrar`, {
    method: "POST",
    headers,
    body: JSON.stringify(body),
  });

  if (cadastraEventoReq.status === 200) {
    limpaFormulário();
    listaEventos.push(body);
    atualizaTabelaEventos();
  }
};

const excluiEvento = (index) => {
  listaEventos.splice(index, 1);
  atualizaTabelaEventos();
};

(async () => {
  getEventos();
})();
