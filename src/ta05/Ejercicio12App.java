package ta05;

import java.util.Scanner;

public class Ejercicio12App {

	public static void main(String[] args) {
		String password = "1234";
		Scanner scan = new Scanner(System.in);
		int numIntentos = 0;
		System.out.println("Introduce la contraseña");
		String respuesta = scan.nextLine();
		
		while (!respuesta.equals(password) && numIntentos < 2) {
			System.out.println("Introduce la contraseña");
			respuesta = scan.nextLine();
			numIntentos++;
		}
		
		if(respuesta.equals(password)) {
			System.out.println("Enhorabuena");
		} else {
			System.out.println("Has excedido el limite de intentos");
		}
		
		scan.close();
	}

}
