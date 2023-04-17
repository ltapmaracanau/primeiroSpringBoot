package br.edu.ifce.primeiroSpringBoot.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_pedido")
public class Pedido {
	
	@Id
	@ GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne()
	private Clientes cliente;
	
	@ManyToMany
	private List<Produto> produtos;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}
	
	

}
