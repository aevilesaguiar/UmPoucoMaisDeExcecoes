
public class MultiplosCatchGenericoJava7 {

	public static void main(String[] args) {
		
	
			int[] numeros= {4,8,16,32,64,128};
			int[] demon = {2,0,4,8,0};
			
			for(int i=0; i<numeros.length;i++) {
				try {
				System.out.println(numeros[i]+"/"+ demon[i]+(numeros[i]/demon[i]));
				}
				catch (ArithmeticException e) {
					System.out.println("Erro ao dividir por zero");
					
				}catch (Throwable e1) {//classe gen�rica
					System.out.println("Posi��o do array invalida");
				}
			}

			
		 

	
	}

}
