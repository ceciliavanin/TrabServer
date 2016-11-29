package br.univel.dto;

import java.sql.Date;

import javax.xml.bind.annotation.XmlRootElement;

import br.univel.banco.anotacoes.*;

/**
 * 
 * Classe básica com atributos e getters e setters referente ao PROFISSIONAL.
 * 
 * Referência com o banco de dados.
 * 
 */

@Tabela ("PROFIS")
@XmlRootElement

public class Profissional {
	
	
	public Profissional(int idprofi, String pnome, Date pdata, String pcpf, String prg) {

		this.idprofi = idprofi;
		this.pnome = pnome;
		this.pdata = pdata;
		this.pcpf = pcpf;
		this.prg = prg;
	}

	public Profissional() {
		// TODO Auto-generated constructor stub
	}

	@Coluna (nome = "IDPROFI", pk=true)
	private int idprofi;
	
	@Coluna (nome = "PNOME", tamanho=50)
	private String pnome;
	
	@Coluna (nome = "PDATA", tamanho=10)
	private Date pdata;
	
	public Date getPdata() {
		return pdata;
	}
	public void setPdata(Date pdata) {
		this.pdata = pdata;
	}

	@Coluna (nome = "PCPF", tamanho=25)
	private String pcpf;
	
	@Coluna (nome = "PRG", tamanho=25)
	private String prg;
	
	
	public int getIdprofi() {
		return idprofi;
	}
	public void setIdprofi(int idprofi) {
		this.idprofi = idprofi;
	}
	public String getPnome() {
		return pnome;
	}
	public void setPnome(String pnome) {
		this.pnome = pnome;
	}
	public String getPcpf() {
		return pcpf;
	}
	public void setPcpf(String pcpf) {
		this.pcpf = pcpf;
	}
	public String getPrg() {
		return prg;
	}
	public void setPrg(String prg) {
		this.prg = prg;
	}
	
}
