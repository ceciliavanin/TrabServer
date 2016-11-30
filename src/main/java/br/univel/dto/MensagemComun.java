package br.univel.dto;

/**
 * Classe mensagem com os atributos, o contexto da comunicação entre o client e server.
 */
import java.io.Serializable;

public class MensagemComun implements Serializable {

	private static final long serialVersionUID = 1L;

	private Envio envio;
	private Recebimento recebimento;
	private int opcao;
	private String query;

	public Envio getEnvio() {
		return envio;
	}

	public void setEnvio(Envio envio) {
		this.envio = envio;
	}

	public Recebimento getRecebimento() {
		return recebimento;
	}

	public void setRecebimento(Recebimento recebimento) {
		this.recebimento = recebimento;
	}

	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}
}
