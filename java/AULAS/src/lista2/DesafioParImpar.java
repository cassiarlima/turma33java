//Desafio em grupo
package lista2;

import java.util.Locale;
import java.util.Scanner;

public class DesafioParImpar {

public static void main(String[] args) {
		
		//variaveis
		Locale.setDefault(Locale.US);
		Scanner ler= new Scanner(System.in);
		int N;
		
		//entradas
		System.out.print("Digite o número : ");
		N=ler.nextInt();
		
		//processamento e saída
		if (N==0) {
			System.out.println("Número é neutro.");
		}
		
		else if (N %2==0) {
			
			System.out.println("Número é par.");		
		}
		
		else {
			System.out.println("Número é impar.");
		}
		
		if (N<0) {
			System.out.println("Número é negativo");
		}
		
		else {
			System.out.println("Número é positivo");
		}
		
}

}


