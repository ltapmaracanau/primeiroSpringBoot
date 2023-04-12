package br.edu.ifce.primeiroSpringBoot.repository;

import org.springframework.data.repository.CrudRepository;
import br.edu.ifce.primeiroSpringBoot.model.Clientes;


public interface ClienteRepository extends CrudRepository<Clientes, Long>{

}
