package br.com.banda.model;

public class TesteCanta {

	public static void main(String[] args) {

		Canta canta1 = new Canta();
		Canta canta2 = new Canta();
		Canta canta3 = new Canta();

		canta1.setBan_Nome("Ramones");
		canta1.setMus_Nome("Pet Semitery");

		canta2.setBan_Nome("Ramones");
		canta2.setMus_Nome("Pet Semitery");

		canta3.setBan_Nome("Ramones");
		canta3.setMus_Nome("Pet Semitery");

		System.out.println("Banda: " + canta1.getBan_Nome() + "\nMúsica: " + canta1.getMus_Nome());
	}
}
