package dev.nivelamento.teste.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Convidados {
	public void setId(long id) {
		this.id = id;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getId() {
		return id;
	}
	
protected Convidados() {}
	
	public Convidados(long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	
	}
}
