package exceptions;

public class Aula2_p3 {

	public static void main(String[] args) {

		// Exceptions: Multiplos Catch - Java 7

		int numeros[] = { 4, 8, 16, 32, 64, 128 };
		int deno[] = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {
			
			try {
				System.out.println(numeros[i] + "/" + deno[i] + " = " + (numeros[i] / deno[i]));
			}

			catch (ArithmeticException | ArrayIndexOutOfBoundsException k) {
				System.out.println("Aconteceu um erro");
			}
		}

	}

}
