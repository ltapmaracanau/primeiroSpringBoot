package br.edu.ifce.primeiroSpringBoot;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ifce.primeiroSpringBoot.model.Clientes;
import br.edu.ifce.primeiroSpringBoot.model.Endereco;
import br.edu.ifce.primeiroSpringBoot.model.Pedido;
import br.edu.ifce.primeiroSpringBoot.repository.ClienteRepository;
import br.edu.ifce.primeiroSpringBoot.repository.EnderecoRepository;

@SpringBootApplication
public class PrimeiroSpringBootApplication  implements CommandLineRunner {
	@Autowired
	private
	ClienteRepository cliente;
	
	@Autowired
	EnderecoRepository endereco;
	
	public static void main(String[] args) {
		SpringApplication.run(PrimeiroSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
		
		
	}

	
}
