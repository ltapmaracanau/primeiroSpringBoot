package br.edu.ifce.primeiroSpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifce.primeiroSpringBoot.model.Clientes;
import br.edu.ifce.primeiroSpringBoot.serviceImpl.ClienteServiceImpl;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	ClienteServiceImpl cliente;
	
	@PostMapping("/add-cliente")
	public Clientes cadastrar(@RequestBody Clientes c) {
		Clientes cl = cliente.salvar(c);
		return cl;
		//return ResponseEntity.status(HttpStatus.OK).body(cl);	
	}
	
	
	
	
	
	
	
	
	

}
