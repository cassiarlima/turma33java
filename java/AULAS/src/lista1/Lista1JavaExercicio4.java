package lista1;

import java.util.Scanner;

//4. Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
//calcule a seguinte express�o:
public class Lista1JavaExercicio4 {
	
	public static void main (String[] args) {
		
		//variveis
		Scanner ler= new Scanner (System.in);
		
		int A,B,C,D,R,S;
		
		//entradas
		System.out.println("Informe o n�mero inteiro de A :");
		A=ler.nextInt();
		System.out.println("Informe o n�mero inteiro de B :");
		B=ler.nextInt();
		System.out.println("Informe o n�mero inteiro de C :");
		C=ler.nextInt();
		
		//processamentos
		R= (int) (Math.pow(A + B,2));
		S= (int) (Math.pow(B + C,2));
		D= (int) ((R+S)/2);
		
		//Sa�das
		
		System.out.println("Valor de D=" +D);
		
	
		
	} // fecha public static
}// fecha class
