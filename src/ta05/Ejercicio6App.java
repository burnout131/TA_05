package ta05;

import java.util.Scanner;

public class Ejercicio6App {
	final static double IVA = 0.21;

	public static double calculadoraIVA(double importe) {
		double importeIVA = (importe * IVA);
		double totalConIVA = importe + importeIVA;
		return totalConIVA;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce precio sin IVA");
		double input = scan.nextDouble();
		System.out.println("Precio con IVA: " + calculadoraIVA(input));

		scan.close();
	}

}
