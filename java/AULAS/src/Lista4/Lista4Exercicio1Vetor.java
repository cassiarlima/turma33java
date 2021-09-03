//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.

package Lista4;

import java.util.Scanner;

public class Lista4Exercicio1Vetor {

	public static void main (String[] args) {
	
		Scanner ler= new Scanner(System.in);
		
		int valores[]= new int[5];
		int x, maiorNumero=0;
		
		for (x=0; x<=4; x++) {
			System.out.println("Digite um valor : ");
			valores[x]=ler.nextInt();
				
		}
		
		for (x=0; x<=4; x++) {
			System.out.println("("+valores[x]+ ")");
			if(valores[x] > maiorNumero) {
				maiorNumero=valores[x];
			}
		}
			
		System.out.print("\nO maior valor do vetor é : "+maiorNumero);
		
	}
	

	
}
