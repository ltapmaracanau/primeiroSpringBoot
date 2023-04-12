package br.edu.ifce.primeiroSpringBoot.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;


import br.edu.ifce.primeiroSpringBoot.model.Clientes;
import br.edu.ifce.primeiroSpringBoot.repository.ClienteRepository;
import br.edu.ifce.primeiroSpringBoot.service.ClienteService;
import br.edu.ifce.primeiroSpringBoot.serviceExceptions.ClienteNotFoundException;

public class ClienteServiceImpl implements ClienteService {
	@Autowired
	ClienteRepository cliente;

	@Override
	public Clientes buscarPorId(Long id) {
		return cliente.findById(id).orElseThrow(() -> new ClienteNotFoundException(id));
	}

}
