package hr.fer.zemris.java.tecaj_1;

public class Formule {
	public static void ispisiSlucajnuFormulu(){
		boolean prva = Math.random() < 0.5;
		System.out.println("Jedna od najpoznatijih formula iz fizike \n ---------------------------------");
		if (prva) {
			System.out.println("E = m * c^2");
		} else{
			System.out.println("F = m * a");
		}
	}
}
		