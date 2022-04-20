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

import dev.nivelamento.teste.model.Eventos;
import dev.nivelamento.teste.repository.EventosRepository;

@CrossOrigin(exposedHeaders = "errors, content-type")
@RequestMapping("/eventos")
@RestController
public class EventosController {
	
	@Autowired
	private EventosRepository repository;
	
	@RequestMapping(value = "/consultarEventos", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Eventos>> findAll() {
		List<Eventos> todos = (List<Eventos>) this.repository.findAll();
		if (todos.isEmpty()) {
			return new ResponseEntity<List<Eventos>>(todos, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Eventos>>(todos, HttpStatus.OK);
	}
	
	
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public Eventos newProperty(@RequestBody Eventos newEventos) {
	    return repository.save(newEventos);
	}
	
}