package ta05;

import java.util.Scanner;

public class Ejercicio11App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce dia de la semana");
		String dia = scan.nextLine().toUpperCase();
		scan.close();
		
		switch (dia) {
		case "LUNES":
			System.out.println("LABORAL");
			break;
		case "MARTES":
			System.out.println("LABORAL");
			break;
		case "MIERCOLES":
			System.out.println("LABORAL");
			break;
		case "JUEVES":
			System.out.println("LABORAL");
			break;
		case "VIERNES":
			System.out.println("LABORAL");
			break;
		case "SABADO":
			System.out.println("NO LABORAL");
			break;
		case "DOMINGO":
			System.out.println("NO LABORAL");
			break;
		default:
			System.out.println("Dia introducido incorrectamente");
		}
	}

}
