/*
 * //*1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
			apresente no final o total do somatório, a média e o total de valores lidos. O programa
			deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
			positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
			negativo.
 */

package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class Lista3Exercicio1Enquanto {
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler= new Scanner(System.in);
		
		double somatorio=0.0, media=0.00, total=0.0, n=0.0;
		
		while (n >= 0) {
			System.out.println("Digite o número à ser somado : ");
			n=ler.nextDouble();
			
			if (n < 0) {
				break;
			}
		
			somatorio=somatorio+n;
			total=total+1;
		
		}	
		
		media=somatorio/total;	
		System.out.printf ("\nA somatória dos numeros digitados é de %.2f ",somatorio);
		System.out.printf ("\nA média média dos valores digitados é de %.2f ", media);
		System.out.printf ("\nO total de numeros digitados é de %.2f ", total);	
			
}


}
