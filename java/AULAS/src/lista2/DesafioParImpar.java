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
		System.out.print("Digite o n�mero : ");
		N=ler.nextInt();
		
		//processamento e sa�da
		if (N==0) {
			System.out.println("N�mero � neutro.");
		}
		
		else if (N %2==0) {
			
			System.out.println("N�mero � par.");		
		}
		
		else {
			System.out.println("N�mero � impar.");
		}
		
		if (N<0) {
			System.out.println("N�mero � negativo");
		}
		
		else {
			System.out.println("N�mero � positivo");
		}
		
}

}


