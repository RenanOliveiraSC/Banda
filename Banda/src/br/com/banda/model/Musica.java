package br.com.banda.model;

public class Musica extends Estilo {

	private int mus_Codigo;
	private String mus_Nome;
	private int mus_Duracao;

	public int getMus_Codigo() {
		return mus_Codigo;
	}

	public void setMus_Codigo(int mus_Codigo) {
		this.mus_Codigo = mus_Codigo;
	}

	public String getMus_Nome() {
		return mus_Nome;
	}

	public void setMus_Nome(String mus_Nome) {
		this.mus_Nome = mus_Nome;
	}

	public int getMus_Duracao() {
		return mus_Duracao;
	}

	public void setMus_Duracao(int mus_Duracao) {
		this.mus_Duracao = mus_Duracao;
	}

}
