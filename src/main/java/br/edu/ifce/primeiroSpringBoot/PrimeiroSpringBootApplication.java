package br.edu.ifce.primeiroSpringBoot;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ifce.primeiroSpringBoot.model.Clientes;
import br.edu.ifce.primeiroSpringBoot.model.Endereco;
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
		// Inserir registro no banco de dados
		/*
		 * Clientes c = new Clientes(); c.setNome("Fulano de tal dos anzois pereira");
		 * c.setTelefone("85 9999-9999"); c.setDtNascimento(new Date()); Endereco e =
		 * new Endereco(); e.setLogradouro("Rua I"); e.setNumero(700); c.setEndereco(e);
		 * 
		 * cliente.save(c);
		 */
		
		// Buscar registro em bd
		// Lembrando: o retorno é um optional e não está sendo tratado no momento.
		/*
		 * Clientes c = cliente.findById(1L).get(); System.out.println(c.getNome() + " "
		 * + c.getEndereco().getLogradouro());
		 */
		
		// Update do registro em bd
		
		/*
		 * Clientes c = cliente.findById(1L).get(); c.setNome("Fulano de tal, apenas");
		 * cliente.save(c);
		 */
		 
		//cliente.deleteById(1L);
		
		Clientes c = new Clientes();
		c.setNome("Fulano de tal");
		c.setDtNascimento(new Date());
		c.setTelefone("85 9999-9999");
		
		Endereco e = new Endereco();
		e.setLogradouro("Rua 1");
		e.setNumero(555);
		
		
		c.setEndereco(e);

		//Endereço salvo pela operação em cascata
		//endereco.save(e);
		cliente.save(c);
		 
		
		
		
	}

	
}
