package ta05;

import java.util.Scanner;

public class CalculadoraInversaApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce el primer numero: ");
		int num1 = scan.nextInt();
		scan.nextLine();

		System.out.print("Introduce el segundo numero: ");
		int num2 = scan.nextInt();
		scan.nextLine();

		System.out.println("Introduce la operacion: ");
		char operador = scan.nextLine().charAt(0);

		switch (operador) {
		case '+':
			System.out.println(num1 + num2);
			break;
		case '-':
			System.out.println(num1 - num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;
		case '/':
			System.out.println(num1 / num2);
			break;
		case '^':
			System.out.println(Math.pow(num1, num2));
			break;
		case '%':
			System.out.println(num1 % num2);
			break;
		default:
			System.out.println("operador no válido");
			break;
		}
		scan.close();
	}

}
