package lista1;

import java.util.Scanner;

//4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
//calcule a seguinte expressão:
public class Lista1JavaExercicio4 {
	
	public static void main (String[] args) {
		
		//variveis
		Scanner ler= new Scanner (System.in);
		
		int A,B,C,D,R,S;
		
		//entradas
		System.out.println("Informe o número inteiro de A :");
		A=ler.nextInt();
		System.out.println("Informe o número inteiro de B :");
		B=ler.nextInt();
		System.out.println("Informe o número inteiro de C :");
		C=ler.nextInt();
		
		//processamentos
		R= (int) (Math.pow(A + B,2));
		S= (int) (Math.pow(B + C,2));
		D= (int) ((R+S)/2);
		
		//Saídas
		
		System.out.println("Valor de D=" +D);
		
	
		
	} // fecha public static
}// fecha class
