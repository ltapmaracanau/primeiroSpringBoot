package br.edu.ifce.primeiroSpringBoot.serviceExceptions;
@SuppressWarnings(value = { "serial" })
public class ClienteNotFoundException  extends RuntimeException {
	public ClienteNotFoundException(Long id){
		 super("Não foi possível encontrar o cliente de id " + id);
	}

}
