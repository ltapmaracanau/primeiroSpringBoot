package br.edu.ifce.primeiroSpringBoot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((requests) -> requests.requestMatchers("/","/webjars/**","/css/**").permitAll().anyRequest().authenticated())
				
		.formLogin((form) -> form.loginPage("/login").permitAll()).logout((logout) -> logout.permitAll());

		return http.build();
	}
	
	// Método que usa o formulário padrão do spring security como login
	/*
	 * @Bean public SecurityFilterChain securityFilterChain(HttpSecurity http)
	 * throws Exception { http.authorizeHttpRequests((requests) ->
	 * requests.requestMatchers("/","/webjars/**","/css/**").permitAll().anyRequest(
	 * ).authenticated() ); http.formLogin(withDefaults());
	 * 
	 * return http.build(); }
	 */

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	MyUserDetailsService customUserDetailsService() {
		return new MyUserDetailsService();
	}

}
