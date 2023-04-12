package br.edu.ifce.primeiroSpringBoot.service;

import br.edu.ifce.primeiroSpringBoot.model.Clientes;

public interface ClienteService {
	
	Clientes buscarPorId(Long id);

}
