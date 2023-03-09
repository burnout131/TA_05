package ta05;

import java.util.Scanner;

import javax.swing.JOptionPane;

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
			JOptionPane.showMessageDialog(null, num1 + num2);
			break;
		case '-':
			JOptionPane.showMessageDialog(null, num1 - num2);
			break;
		case '*':
			JOptionPane.showMessageDialog(null, num1 * num2);
			break;
		case '/':
			JOptionPane.showMessageDialog(null, num1 / num2);
			break;
		case '^':
			JOptionPane.showMessageDialog(null, Math.pow(num1, num2));
			break;
		case '%':
			JOptionPane.showMessageDialog(null, num1 % num2);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Operador no valido");
			break;
		}
		scan.close();
	}

}
