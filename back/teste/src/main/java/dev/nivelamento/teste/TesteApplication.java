package dev.nivelamento.teste;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dev.nivelamento.teste.model.Eventos;
import dev.nivelamento.teste.repository.EventosRepository;

@SpringBootApplication
public class TesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteApplication.class, args);
	}
	
	@Bean 
	public CommandLineRunner nomeEvento(EventosRepository repository) {
		return (args) -> {
			// criando objetos
			repository.save(new Eventos(0, "evento", "local", "nome", 10));   
			repository.save(new Eventos(0, "evento2", "local2", "nome2", 30));
				
		};

	}

}
