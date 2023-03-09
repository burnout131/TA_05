package ta05;

import java.util.Scanner;

public class Ejercicio10App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce numero de ventas: ");
		int numVentas = scan.nextInt();
		double sumaVentas = 0.0;
		
		for(int i = 0; i < numVentas; i++) {
			System.out.println("Introduce importe venta");
			sumaVentas += scan.nextDouble();
		}
		System.out.println(sumaVentas);
		scan.close();
	}

}
