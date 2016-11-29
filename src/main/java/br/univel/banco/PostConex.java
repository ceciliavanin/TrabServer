package br.univel.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * Nesta classe temos a implementa��o que faz conex�o com o Banco de Dados. 
 * @author Cecilia Vanin
 *
 */

public class PostConex {

	private static final PostConex INSTANCIA = new PostConex();
	private static final String URL = "localhost:5432/cadastro";
	private static final String USUARIO = "postgres";
	private static final String SENHA = "univel";

	public PostConex() {
	}
	
	public static PostConex getInstancia(){
		return INSTANCIA;
	}
	public Connection connect(){
		try{
			Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA);
			return connection;
		}catch(final SQLException e){
			throw new RuntimeException("Erro na conex�o com o banco de dados", e);
		}
	}
}
