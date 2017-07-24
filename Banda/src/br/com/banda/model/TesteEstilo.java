package br.com.banda.model;

public class TesteEstilo {

	public static void main(String[] args) {
		
		Estilo estilo1 = new Estilo();
		Estilo estilo2 = new Estilo();
		Estilo estilo3 = new Estilo();
		
		estilo1.setEst_Nome("Rock in Roll");
		System.out.println("Estilo Musical: "+ estilo1.getEst_Nome());
		
		
	}
}
