//Construa um programa em c que, tendo como dados de entrada dois pontos
//quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula

package lista1;

import java.util.Scanner;

public class Lista1Exercício6 {

	public static void main (String[] Args) {
	
		Scanner ler= new Scanner(System.in);
		
		//variaveis
		double x1,y1,x2,y2,P,D;
		
		//Entradas
		System.out.println("Informe o valor de X1: ");
		x1=ler.nextDouble();
		System.out.println("Informe o valor de X2: ");
		x2=ler.nextDouble();
		System.out.println("Informe o valor de Y1: ");
		y1=ler.nextDouble();
		System.out.println("Informe o valor de Y2: ");
		y2=ler.nextDouble();
		
		//Processamentos
		D= Math.sqrt((Math.pow((x2-x1),2)+Math.pow((y1-y2),2)));
		
		//Saídas
		System.out.println("O valor de D é : "+D);
		
		
		
		
	}
}
