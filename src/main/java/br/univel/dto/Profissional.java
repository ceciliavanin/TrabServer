package br.univel.dto;

import java.sql.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * Classe básica com atributos e getters e setters referente ao PROFISSIONAL.
 * 
 * 
 */

public class Profissional {

	public Profissional() {

		this.idprofi = idprofi;
		this.pnome = pnome;
		this.pdata = pdata;
		this.pcpf = pcpf;
		this.prg = prg;
	}

	private int idprofi;

	private String pnome;

	private Date pdata;

	public Date getPdata() {
		return pdata;
	}

	public void setPdata(Date pdata) {
		this.pdata = pdata;
	}

	private String pcpf;

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
