package br.edu.ifce.primeiroSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.ifce.primeiroSpringBoot.model.Perfil;

public interface PerfilRepository extends JpaRepository<Perfil, Long> {

}
