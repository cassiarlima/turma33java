//5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
//aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
//respectivamente.
package lista1;

import java.util.Scanner;

public class Lista1Exerc�cio5Java {
	
	public static void main (String[] args) {
		
		Scanner ler= new Scanner(System.in);
		
		//variaveis
		double nota1,nota2,nota3;
		double mediaFinal;
		
		//Entradas
		System.out.println("Informe a primeira nota : ");
		nota1=ler.nextDouble();
		System.out.println("Informe a segunda nota : ");
		nota2=ler.nextDouble();
		System.out.println("Informe a terceira nota : ");
		nota3=ler.nextDouble();
		
		//processamentos
		mediaFinal=((nota1*2)+(nota2*3)+(nota3*5)/10);
		
		//sa�das
		System.out.println("A sua nota � : "+mediaFinal);
		
		
		
		
		
		
		
		
		
		
	}//fecha public static
	
}//fecha programa
