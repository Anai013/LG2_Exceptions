package exceptions;

public class Aula4_p1 {

	// Exceptions Genérica: Usando o StackTrace

	public static void main(String[] args) {

		int numeros[] = { 4, 8, 16, 32, 64, 128 };
		int deno[] = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {

			try {
				System.out.println(numeros[i] + "/" + deno[i] + " = " + (numeros[i] / deno[i]));
			}

			catch (Exception k) {
				System.out.println(k.getMessage());
				k.printStackTrace();
			}
		}
	}
}
