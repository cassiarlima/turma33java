/*
 * 1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 */

package lista2;

import java.util.Scanner;

public class Lista2Exerc�cio1Java {

	public static void main (String [] arg) {
		
		//vari�veis
		Scanner ler= new Scanner(System.in);
		int maior,num1,num2,num3;
		
		//entrada
		System.out.print("Digite o primeiro n�mero : ");
		num1=ler.nextInt();
		System.out.print("Digite o segundo n�mero : ");
		num2=ler.nextInt();
		System.out.print("Digite o terceiro n�mero : ");
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
		
		//sa�da
		System.out.println("O maior n�mero � "+maior);
		
		
		
	}//fecha entrada principal
	
	
}//fecha programa
