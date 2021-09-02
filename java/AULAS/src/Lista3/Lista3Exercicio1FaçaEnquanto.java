/*
 * Faça um programa que mostre uma contagem na tela de 233 a 456, só que
	contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
 */

package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class Lista3Exercicio1FaçaEnquanto {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler= new Scanner(System.in);
	
		int contador=233;
		
		do {  System.out.println(contador);
			if (contador > 299 && contador <=400) {
				contador = contador + 3;
				
			}
			else {
				contador=contador+5;
				System.out.println(contador);
			}
		}while (contador <= 456);
			
		System.out.println(contador);
		
		
		
}

}
