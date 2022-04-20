package dev.nivelamento.teste.service;

import java.util.List;
import java.util.Optional;

import dev.nivelamento.teste.model.Eventos;
import dev.nivelamento.teste.repository.EventosRepository;

public class EventosService implements EventosRepository{

	
	@Override
	public <S extends  Eventos> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends  Eventos> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional< Eventos> findById(List<Eventos> id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(List< Eventos> id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable< Eventos> findAllById(Iterable<List< Eventos>> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(List< Eventos> id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete( Eventos entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends List< Eventos>> ids) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAll(Iterable<? extends  Eventos> entities) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public  Eventos findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List< Eventos> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
