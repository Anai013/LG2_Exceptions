package exceptions;

import java.util.Scanner;

public class Aula4_p2 {

	// Exceptions Gen�rica: Usando o Throws

	public static void main(String[] args) {

		System.out.println("Entre com um n�mero decimal: ");

		try {
			double num = leNumero();
			System.out.println("Voc� digitou " + num);
		} 
		
		catch (Exception k) {
			System.out.println("Entrada inv�lida");
			k.printStackTrace();
		}
	}

	public static double leNumero() throws Exception {
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		return num;
	}
}
