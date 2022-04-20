package dev.nivelamento.teste.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dev.nivelamento.teste.model.Convidados;
import dev.nivelamento.teste.repository.ConvidadosRepository;


@CrossOrigin(exposedHeaders = "errors, content-type")
@RequestMapping("/eventos")
@RestController
public class ConvidadosController {
	
	@Autowired
	private ConvidadosRepository repository;
	
	@RequestMapping(value = "/consultarConvidados", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Convidados>> findAll() {
		List<Convidados> todos = (List<Convidados>) this.repository.findAll();
		if (todos.isEmpty()) {
			return new ResponseEntity<List<Convidados>>(todos, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Convidados>>(todos, HttpStatus.OK);
	}
	
	
	
	@RequestMapping(value = "/cadastrarConvidado", method = RequestMethod.POST)
	public Convidados newProperty(@RequestBody Convidados newEventos) {
	    return repository.save(newEventos);
	}
	
}