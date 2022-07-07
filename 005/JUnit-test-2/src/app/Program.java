package app;

import entities.Finance;

public class Program {

	public static void main(String[] args) {

		try {
			Finance f1 = new Finance(100000.0, 2000.0, 20);
			System.out.println("Dados do financiamento 1:");
			System.out.printf("Entrada: %.2f%n", f1.entry());
			System.out.printf("Presta��o: %.2f%n", f1.quota());
		}
		catch (IllegalArgumentException e) {
			System.out.println("Erro no financiamento 1: " + e.getMessage());
		}
		
		try {
			Finance f2 = new Finance(100000.0, 2000.0, 80);
			System.out.println("Dados do financiamento 2:");
			System.out.printf("Entrada: %.2f%n", f2.entry());
			System.out.printf("Presta��o: %.2f%n", f2.quota());
		}
		catch (IllegalArgumentException e) {
			System.out.println("Erro no financiamento 2: " + e.getMessage());
		}
	}
}