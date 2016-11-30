package br.univel.controller.socket;

import java.sql.Connection;

import br.univel.banco.PostConex;
import br.univel.banco.ProfiDAO;
import br.univel.dto.Profissional;

/**
 * Esta classe faz a tratativa de escolha do usuário ao lidar com a interface
 * utilizando como método de seleção para ter ações para inserir um novo PROFISSIONAL, alterar ou então excluir.
 */

public class LendoReceptorProfi {
	public Object controlar(Object object, int opcao, String query) {
		Connection conex = null;
		PostConex post = null;

		conex = post.connect();

		if (object.getClass().equals(Profissional.class)) {

			ProfiDAO cdao = new ProfiDAO();

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
