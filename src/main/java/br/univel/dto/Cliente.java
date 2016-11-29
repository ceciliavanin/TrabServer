package br.univel.dto;

import java.sql.Date;
import javax.xml.bind.annotation.XmlRootElement;
import br.univel.banco.anotacoes.Coluna;
import br.univel.banco.anotacoes.Tabela;

/**
 * 
 * Classe básica com atributos e getters e setters referente ao CLIENTE.
 * 
 * Referência com o banco de dados.
 * 
 */


@Tabela ("CLIENTE")
@XmlRootElement
public class Cliente {
	
	
	public Cliente(int idcli, String cnome, String ccpf, String crg, Date cdata) {

		this.idcli = idcli;
		this.cnome = cnome;
		this.cdata = cdata;
		this.ccpf = ccpf;
		this.crg = crg;
	
	}
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	@Coluna (nome = "IDCLI", pk=true)
	private int idcli;
	
	@Coluna (nome="CNOME", tamanho=50)
	private String cnome;
	
	@Coluna (nome="CDATA", tamanho=10)
	private Date cdata;
	
	@Coluna (nome="CCPF", tamanho=25)
	private String ccpf;
	
	@Coluna (nome="CRG", tamanho=25)
	private String crg;
	
	public String getCnome() {
		return cnome;
	}
	public void setCnome(String cnome) {
		this.cnome = cnome;
	}
	
	public String getCcpf() {
		return ccpf;
	}
	public void setCcpf(String ccpf) {
		this.ccpf = ccpf;
	}
	public String getCrg() {
		return crg;
	}
	public void setCrg(String crg) {
		this.crg = crg;
	}
	public int getIdcli() {
		return idcli;
	}
	public void setIdcli(int idcli) {
		this.idcli = idcli;
	}
	public Date getCdata() {
		return cdata;
	}
	public void setCdata(Date cdata) {
		this.cdata = cdata;
	}

}
