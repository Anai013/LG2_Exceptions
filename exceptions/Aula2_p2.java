package exceptions;

public class Aula2_p2 {

	// Exception Genérico: Multiplos Catch - Throwable

	public static void main(String[] args) {

		int numeros[] = { 4, 8, 16, 32, 64, 128 };
		int deno[] = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {

			try {
				System.out.println(numeros[i] + "/" + deno[i] + " = " + (numeros[i] / deno[i]));
			}

			catch (ArithmeticException k) {
				System.out.println("Erro ao dividir por zero");
			}

			catch (Throwable k) {
				System.out.println("Ocorreu um erro");
			}
		}

	}

}
