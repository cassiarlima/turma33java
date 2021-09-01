/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
 * 
 */

package lista2;

import java.util.Locale;
import java.util.Scanner;

public class Lista2Exercício4 {

	public static void main(String[] args) {
		
			//variaveis
				Locale.setDefault(Locale.US);
				Scanner ler= new Scanner(System.in);
				double raiz, N, nQdrado;
				
				//entradas
				System.out.print("Digite o número : ");
				N=ler.nextDouble();
				
				//processamento e saída
				if (N==0) {
					System.out.println("Número é neutro.");
				}
				
				else if (N %2==0 ) {
					
					System.out.println("Número é par.");		
					raiz= (Math.sqrt(N));
					System.out.println("A raiz quadrada é : "+raiz);
				}
				
				else {
					
					System.out.println("Número é impar.");
					nQdrado= N*N;
					System.out.println("O número elevado ao quadrado é :" + nQdrado);
							
				}
				
			
    	}
}
		
