package dev.nivelamento.teste.service;

import java.util.List;
import java.util.Optional;

import dev.nivelamento.teste.model.Convidados;
import dev.nivelamento.teste.repository.ConvidadosRepository;

public class ConvidadosService implements ConvidadosRepository{

	
	@Override
	public <S extends  Convidados> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends  Convidados> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional< Convidados> findById(List<Convidados> id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(List< Convidados> id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable< Convidados> findAllById(Iterable<List< Convidados>> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(List< Convidados> id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete( Convidados entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends List< Convidados>> ids) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAll(Iterable<? extends  Convidados> entities) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public  Convidados findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List< Convidados> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
