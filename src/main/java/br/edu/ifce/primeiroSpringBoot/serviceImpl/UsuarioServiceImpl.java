package br.edu.ifce.primeiroSpringBoot.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifce.primeiroSpringBoot.model.Usuario;
import br.edu.ifce.primeiroSpringBoot.repository.UsuarioRepository;
import br.edu.ifce.primeiroSpringBoot.service.UsuarioService;
@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository usuario;
	
	@Override
	public Usuario buscarPorEmail(String email) {
		return usuario.buscarPorEmail(email);
	}

}
