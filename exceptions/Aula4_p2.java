package exceptions;

import java.util.Scanner;

public class Aula4_p2 {

	// Exceptions Genérica: Usando o Throws

	public static void main(String[] args) {

		System.out.println("Entre com um número decimal: ");

		try {
			double num = leNumero();
			System.out.println("Você digitou " + num);
		} 
		
		catch (Exception k) {
			System.out.println("Entrada inválida");
			k.printStackTrace();
		}
	}

	public static double leNumero() throws Exception {
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		return num;
	}
}
