/*4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.
 * 
 */

package lista2;

import java.util.Locale;
import java.util.Scanner;

public class Lista2Exerc�cio4 {

	public static void main(String[] args) {
		
			//variaveis
				Locale.setDefault(Locale.US);
				Scanner ler= new Scanner(System.in);
				double raiz, N, nQdrado;
				
				//entradas
				System.out.print("Digite o n�mero : ");
				N=ler.nextDouble();
				
				//processamento e sa�da
				if (N==0) {
					System.out.println("N�mero � neutro.");
				}
				
				else if (N %2==0 ) {
					
					System.out.println("N�mero � par.");		
					raiz= (Math.sqrt(N));
					System.out.println("A raiz quadrada � : "+raiz);
				}
				
				else {
					
					System.out.println("N�mero � impar.");
					nQdrado= N*N;
					System.out.println("O n�mero elevado ao quadrado � :" + nQdrado);
							
				}
				
			
    	}
}
		
