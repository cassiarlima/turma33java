/*
 * Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
	final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
	0(zero).(DO...WHILE)
 */

package Lista3;

import java.util.Scanner;

public class Lista3Exerc�cio6DoWhile {
		
		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			
			
			int numero = 1, media = 0, contagem = 0;
			
			do {
				System.out.println("Digite um valor :");
				numero = leia.nextInt();
				if(numero % 3 == 0) {
					media = media + numero;
					contagem = contagem + 1;
				}
			}while(numero != 0);
			leia.close();
			media = media/contagem;
			
			System.out.println("A media dos numeros multiplos de 3 � :" + media);
			
		}
	}
	
		