package br.univel.dto;

import java.io.Serializable;

public class Login implements Serializable {

	/**
	 * Usuário e senha para acesso ao sistema
	 */
	private static final long serialVersionUID = 1L;

	private String usuario;
	private String senha;

	public Login() {

		this.usuario = usuario;
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
