package br.edu.ifce.primeiroSpringBoot.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifce.primeiroSpringBoot.model.Perfil;
import br.edu.ifce.primeiroSpringBoot.repository.PerfilRepository;
import br.edu.ifce.primeiroSpringBoot.service.PerfilService;
@Service
public class PerfilServiceImpl implements PerfilService {

	
	@Autowired
	PerfilRepository perfil;

	@Override
	public Perfil salvar(Perfil p) {
		return perfil.save(p);
	}

}
