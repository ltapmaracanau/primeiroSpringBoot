package br.edu.ifce.primeiroSpringBoot.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import br.edu.ifce.primeiroSpringBoot.model.Perfil;
import br.edu.ifce.primeiroSpringBoot.model.Usuario;
import br.edu.ifce.primeiroSpringBoot.serviceImpl.UsuarioServiceImpl;

public class MyUserDetailsService  implements UserDetailsService {

	@Autowired
	private UsuarioServiceImpl usuario;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario u = usuario.buscarPorEmail(username);
		
		return new org.springframework.security.core.userdetails.User (
				u.getEmail(),	
				u.getPassword(),
				AuthorityUtils.createAuthorityList(getAtuthorities(u.getPerfil())));
		}
	
	private String[] getAtuthorities(List<Perfil> perfis) {
		String[] authorities = new String[perfis.size()];
		for (int i = 0; i < perfis.size(); i++) {
			authorities[i] = perfis.get(i).getDescricao();
		}
		return authorities;
	}

}
