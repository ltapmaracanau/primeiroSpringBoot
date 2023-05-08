package br.edu.ifce.primeiroSpringBoot.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifce.primeiroSpringBoot.model.Clientes;
import br.edu.ifce.primeiroSpringBoot.repository.ClienteRepository;
import br.edu.ifce.primeiroSpringBoot.service.ClienteService;
import br.edu.ifce.primeiroSpringBoot.serviceExceptions.ClienteNotFoundException;
@Service
public class ClienteServiceImpl implements ClienteService {
	@Autowired
	ClienteRepository cliente;

	@Override
	public Clientes buscarPorId(Long id) {
		return cliente.findById(id).orElseThrow(() -> new ClienteNotFoundException(id));
	}

	public Clientes salvar(Clientes c) {
		return cliente.save(c);
	}

}
