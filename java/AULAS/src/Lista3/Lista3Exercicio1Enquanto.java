/*
 * //*1- Elaborar um programa que efetue a leitura sucessiva de valores num�ricos e
			apresente no final o total do somat�rio, a m�dia e o total de valores lidos. O programa
			deve fazer as leituras dos valores enquanto o usu�rio estiver fornecendo valores
			positivos. Ou seja, o programa deve parar quando o usu�rio fornecer um valor
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
			System.out.println("Digite o n�mero � ser somado : ");
			n=ler.nextDouble();
			
			if (n < 0) {
				break;
			}
		
			somatorio=somatorio+n;
			total=total+1;
		
		}	
		
		media=somatorio/total;	
		System.out.printf ("\nA somat�ria dos numeros digitados � de %.2f ",somatorio);
		System.out.printf ("\nA m�dia m�dia dos valores digitados � de %.2f ", media);
		System.out.printf ("\nO total de numeros digitados � de %.2f ", total);	
			
}


}
