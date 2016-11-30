package br.univel.controller.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import br.univel.threads.threads;
/**
 * Esta classe possui as informações e tratativas necessárias para iniciar o servidor
 * definição de porta do server, quantidades de threads que podem ser executadas, etc.
 * 
 * @author Cecilia Vanin
 *
 */
public class IniciaServidor {
	private final ExecutorService pool = Executors.newFixedThreadPool(4);

	public void init() throws IOException {
		ServerSocket server = new ServerSocket(5000);
		System.out.println("Servidor iniciado");

		while (!server.isClosed()) {
			Socket connection = server.accept();

			System.out.println("Nova conexão recebida");

			pool.submit(new threads(connection));
		}
		pool.shutdown();
	}

	public static void main(String[] args) {
		try {
			new IniciaServidor().init();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
