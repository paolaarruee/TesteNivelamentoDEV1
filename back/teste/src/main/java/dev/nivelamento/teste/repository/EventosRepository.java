package dev.nivelamento.teste.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import dev.nivelamento.teste.model.Eventos;

public interface EventosRepository extends CrudRepository<Eventos, List<Eventos>> {

	Eventos findById(long id);

}
