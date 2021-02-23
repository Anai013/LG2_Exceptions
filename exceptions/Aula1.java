package exceptions;

public class Aula1 {

	// Exceptions: Try e Catch

	public static void main(String[] args) {

		try {

			int k[] = new int[4];

			System.out.println("Antes da exception");

			k[4] = 13;

			System.out.println("Esse texto não será impresso");
		} 
		
		catch (ArrayIndexOutOfBoundsException exception) {

			System.out.println("Exceção ao acessar um indice do vetor que não existe");
		}

		System.out.println("Esse texto será impresso após a exception");
	}

}
