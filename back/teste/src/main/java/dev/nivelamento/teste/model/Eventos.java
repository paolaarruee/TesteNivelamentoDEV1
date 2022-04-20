package dev.nivelamento.teste.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class Eventos {
	public void setId(long id) {
		this.id = id;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String evento;
	private String local;
	private String nome;
	private int idade;
	
	protected Eventos() {}
	
	public Eventos(long id, String evento, String local, String nome, int idade) {
		super();
		this.id = id;
		this.evento = evento;
		this.local = local;
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getEvento() {
		return evento;
	}
	
	public void setEvento(String evento) {
		this.evento = evento;
	}
	
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public long getId() {
		return id;
	}
	
	
}
