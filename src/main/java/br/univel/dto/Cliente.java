package br.univel.dto;

import java.sql.Date;

/**
 * 
 * Classe básica com atributos e getters e setters referente ao CLIENTE.
 * 
 * 
 */


public class Cliente {
	
	
	public Cliente() {

		this.idcli = idcli;
		this.cnome = cnome;
		this.cdata = cdata;
		this.ccpf = ccpf;
		this.crg = crg;
	
	}
	private int idcli;

	private String cnome;

	private Date cdata;

	private String ccpf;

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
