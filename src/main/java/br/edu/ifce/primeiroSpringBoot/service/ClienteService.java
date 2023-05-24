package br.edu.ifce.primeiroSpringBoot.service;

import java.util.List;

import br.edu.ifce.primeiroSpringBoot.model.Clientes;

public interface ClienteService {
	
	Clientes buscarPorId(Long id);
	
	List<Clientes> buscarTodos();
	
	Clientes salvar(Clientes c);
	
	Clientes editar(Clientes c);
	
	void excluir(Long id);
	
	
	
	
	
	

}
