package br.edu.ifce.primeiroSpringBoot.service;

import br.edu.ifce.primeiroSpringBoot.model.Usuario;

public interface UsuarioService {
	
	Usuario buscarPorEmail(String email);

}
