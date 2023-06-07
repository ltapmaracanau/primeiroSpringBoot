package br.edu.ifce.primeiroSpringBoot;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ifce.primeiroSpringBoot.model.Perfil;
import br.edu.ifce.primeiroSpringBoot.model.Usuario;
import br.edu.ifce.primeiroSpringBoot.repository.ClienteRepository;
import br.edu.ifce.primeiroSpringBoot.repository.EnderecoRepository;
import br.edu.ifce.primeiroSpringBoot.repository.PerfilRepository;
import br.edu.ifce.primeiroSpringBoot.repository.UsuarioRepository;
import br.edu.ifce.primeiroSpringBoot.serviceImpl.PerfilServiceImpl;

@SpringBootApplication
public class PrimeiroSpringBootApplication  implements CommandLineRunner {
	@Autowired
	private UsuarioRepository usuario;
	
	@Autowired
	private PerfilRepository perfil;
	
	public static void main(String[] args) {
		SpringApplication.run(PrimeiroSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Usuario u = new Usuario(); u.setEmail("cjunior@ifce.edu.br");
		 * u.setPassword("$2a$12$aU6sK6Zvb7Q/EslO47EMfOhp4DQFgtQkT8qvd5jSIfX/VX2F2QntO")
		 * ;
		 * 
		 * List<Perfil> lp= new ArrayList<Perfil>();
		 * 
		 * Perfil p = perfil.findById(1L).get(); Perfil p1 = perfil.findById(2L).get();
		 * Perfil p2 = perfil.findById(3L).get(); lp.add(p); lp.add(p1); lp.add(p2);
		 * u.setPerfil(lp); usuario.save(u);
		 */
		
		
		
				
	}

	
}
