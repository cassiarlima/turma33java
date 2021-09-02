/*
 * 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	idade for =-99. (WHILE)
 */

package Lista3;

import java.util.Scanner;

public class Lista3Exercício3While {
	
	public static void main (String[] args) {

		
		//variaveis
		Scanner  ler= new Scanner(System.in);
		
		int idade21=0, idade50=0, idade=0;
		
		while(idade != -99) {
			System.out.print("Digite sua idade");
			idade=ler.nextInt();
			
			if (idade < 21) {
				idade21++;
			}
			if (idade > 50) {
				idade50++;
			}
			
			if (idade== -99) {
				break;
			}
		}
		
		System.out.printf("As pessoas com menos de 21 anos é %d e com mais de 50 anos é %d",idade21,idade50);
	}
}

		