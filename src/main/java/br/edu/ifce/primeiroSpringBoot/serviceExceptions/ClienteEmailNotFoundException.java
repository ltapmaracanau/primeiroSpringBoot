package br.edu.ifce.primeiroSpringBoot.serviceExceptions;
@SuppressWarnings(value = { "serial" })
public class ClienteEmailNotFoundException extends RuntimeException{
	public ClienteEmailNotFoundException(String mail ){
		 super("Não foi possível encontrar o cliente de email " + mail);
	}

}
