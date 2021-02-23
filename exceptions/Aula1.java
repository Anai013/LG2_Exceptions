package exceptions;

public class Aula1 {

	// Exceptions: Try e Catch

	public static void main(String[] args) {

		try {

			int k[] = new int[4];

			System.out.println("Antes da exception");

			k[4] = 13;

			System.out.println("Esse texto n�o ser� impresso");
		} 
		
		catch (ArrayIndexOutOfBoundsException exception) {

			System.out.println("Exce��o ao acessar um indice do vetor que n�o existe");
		}

		System.out.println("Esse texto ser� impresso ap�s a exception");
	}

}
