
public class Excecao {

	public static void main(String[] args) {

		
		try {
			int [] vetor = new int[4];
			System.out.println("Antes da exception");
			
			vetor[4]=1;
			
			System.out.println("N�o ser� impresso");
			
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exce��o ao acessar um indice do vetor que n�o existe");
		}

		System.out.println("Esse texto ser� trtatdo ap�s exception");

	}

}
