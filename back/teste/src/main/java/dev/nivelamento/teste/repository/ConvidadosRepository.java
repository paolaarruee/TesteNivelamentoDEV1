package dev.nivelamento.teste.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import dev.nivelamento.teste.model.Convidados;


public interface ConvidadosRepository extends CrudRepository<Convidados, List<Convidados>> {

	Convidados findById(long id);
}
