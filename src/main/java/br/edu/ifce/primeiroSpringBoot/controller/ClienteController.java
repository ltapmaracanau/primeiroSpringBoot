package br.edu.ifce.primeiroSpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifce.primeiroSpringBoot.model.Clientes;
import br.edu.ifce.primeiroSpringBoot.serviceImpl.ClienteServiceImpl;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	ClienteServiceImpl cliente;
	
	@GetMapping("/cadastrar")
	public String cadastrar(ModelMap model) {
		model.addAttribute("cli", new Clientes());
		return "/cliente/cadastro";	
	}
	
	@PostMapping("/salvar")
	public String salvar(Clientes cli) {
		cliente.salvar(cli);
		return "redirect:/cliente/listar";
	}
	
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("clientes",cliente.buscarTodos());
		return "/cliente/lista";	
	}
	
	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("cli",cliente.buscarPorId(id));
		return "/cliente/cadastro";
	}
	
	@PostMapping ("/editar")
	public String editar(Clientes cli) {
		cliente.editar(cli);
		return "redirect:/cliente/listar";
	}
	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, ModelMap model) {
		cliente.excluir(id);
		return "redirect:/cliente/listar";
	}
	
	
	
	
	
	
	
	

}
