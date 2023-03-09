package ta05;

import java.util.Scanner;

public class Ejercicio4App {
	public static double areaCirculo(double radio) {
		return (Math.pow(radio, 2) * Math.PI);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el radio del circulo: ");
		double radio = Double.parseDouble(scan.nextLine());
		System.out.print(areaCirculo(radio));
		scan.close();
	}

}
