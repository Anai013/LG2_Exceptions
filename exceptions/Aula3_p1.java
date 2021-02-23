package exceptions;

public class Aula3_p1 {

	// Exceptions: Testando o Finally

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

			catch (ArrayIndexOutOfBoundsException k) {
				System.out.println("Posição do array inválida");
			}

			finally {
				System.out.println("Essa linha é sempre executada após o Try ou Catch");
			}
		}
	}

}
