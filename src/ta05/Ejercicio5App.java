package ta05;

import java.util.Scanner;

public class Ejercicio5App {
	public static String esDivisible(int num) {
		int resto = num % 2;
		
		if(resto == 0) {
			return "ES DIVISIBLE";
		}else {
			return "NO ES DIVISIBLE";
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Introduce un numero para comprobar si es divisible entre 2: ");
		int num = scan.nextInt();
		System.out.println(esDivisible(num));
		scan.close();
	}

}
