const eventosget = 'http://localhost:8080/eventos/consultarEventos';
const eventopost = '';

let listaEventos = [];

const setListaEventos = async () => {
    const eventosRequest = await fetch(eventosUrl);
    listaEventos = await eventosRequest.json();
};






const setListaConvidados = () => {
    const corpoTabelaRef = document.getElementById('listaEventosRef');
    listaEventos.forEach(evento => corpoTabelaRef.innerHTML = corpoTabelaRef.innerHTML.concat(`<tr><td>${evento.id}</td><td>${evento.evento}</td><td>${evento.local}</td><td><ul><li>${evento.nome}</ul></li></td></tr>`
    ))
};

(async () => {
    await setListaEventos();
    setListaConvidados();
})();

