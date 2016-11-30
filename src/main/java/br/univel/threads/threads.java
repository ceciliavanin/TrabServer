package br.univel.threads;
/**
 * classe qual inicia a criação de threads
 */
import java.net.Socket;

public class threads implements Runnable {
	
	private final Socket connection;
	
	
	public threads(final Socket connection){
		this.connection = connection;
	}

	@Override
	public void run() {
		
	}

}
