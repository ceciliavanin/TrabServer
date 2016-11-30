package br.univel.controller.socket;

/**
 * Esta classe faz a tratativa de escolha do cliente ao lidar com a interface
 * utilizando como método de seleção para ter ações para inserir um novo CLIENTE, alterar ou então excluir.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.sql.Connection;
import java.util.ArrayList;

import br.univel.banco.CliDAO;
import br.univel.banco.PostConex;
import br.univel.dto.Cliente;
import br.univel.dto.Profissional;

public class LendoReceptor {

	public Object controlar(Object object, int opcao, String query) {
		Connection conex = null;
		PostConex post = null;

		conex = post.connect();

		if (object.getClass().equals(Cliente.class)) {

			CliDAO cdao = new CliDAO();

			switch (opcao) {
			case 1:
				cdao.insert(query);

				break;

			case 2:
				cdao.update(query);

				break;

			case 3:
				cdao.delete(query);

				break;

			default:
				break;
			}
		}
		return null;
	}
}