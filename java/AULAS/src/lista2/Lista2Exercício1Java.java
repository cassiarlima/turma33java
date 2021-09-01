/*
 * 1- Faça um programa que receba três inteiros e diga qual deles é o maior.
 */

package lista2;

import java.util.Scanner;

public class Lista2Exercício1Java {

	public static void main (String [] arg) {
		
		//variáveis
		Scanner ler= new Scanner(System.in);
		int maior,num1,num2,num3;
		
		//entrada
		System.out.print("Digite o primeiro número : ");
		num1=ler.nextInt();
		System.out.print("Digite o segundo número : ");
		num2=ler.nextInt();
		System.out.print("Digite o terceiro número : ");
		num3=ler.nextInt();
		
		//processamentos
		if(num1 > num2) {
			if (num1 > num3);
			maior=num1;		
		}//fecha if
		
		else if (num2 > num3) {
			if (num2 > num1);
			maior=num2;		
		}//fecha else if
		
		else {
			maior=num3;
		}//fecha else
		
		//saída
		System.out.println("O maior número é "+maior);
		
		
		
	}//fecha entrada principal
	
	
}//fecha programa
