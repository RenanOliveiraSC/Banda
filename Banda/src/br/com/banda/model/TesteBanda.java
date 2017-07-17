package br.com.banda.model;

public class TesteBanda {

	public static void main(String[] args) {

		Banda banda1 = new Banda();
		Banda banda2 = new Banda();
		Banda banda3 = new Banda();

		banda1.setBan_Nome("Ramones");
		banda1.setEst_Nome("Punk Rock");
		banda1.setMus_Nome("Pet Sematary");

		System.out.println("Banda: " + banda1.getBan_Nome() + "\nEstilo: " + banda1.getEst_Nome() + "\nMúsica:"
				+ banda1.getMus_Nome());
	}
}
