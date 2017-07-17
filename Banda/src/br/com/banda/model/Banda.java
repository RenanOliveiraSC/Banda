package br.com.banda.model;

import java.util.Date;

public class Banda extends Musica {

	private int ban_Codig;
	private String ban_Nome;
	private Date dt_Criacao;
	private int ban_Pais;

	public int getBan_Codig() {
		return ban_Codig;
	}

	public void setBan_Codig(int ban_Codig) {
		this.ban_Codig = ban_Codig;
	}

	public String getBan_Nome() {
		return ban_Nome;
	}

	public void setBan_Nome(String ban_Nome) {
		this.ban_Nome = ban_Nome;
	}

	public Date getDt_Criacao() {
		return dt_Criacao;
	}

	public void setDt_Criacao(Date dt_Criacao) {
		this.dt_Criacao = dt_Criacao;
	}

	public int getBan_Pais() {
		return ban_Pais;
	}

	public void setBan_Pais(int ban_Pais) {
		this.ban_Pais = ban_Pais;
	}

}
