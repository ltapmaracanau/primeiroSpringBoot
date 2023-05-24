package br.edu.ifce.primeiroSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.ifce.primeiroSpringBoot.model.Clientes;


public interface ClienteRepository extends JpaRepository<Clientes, Long>{

}
