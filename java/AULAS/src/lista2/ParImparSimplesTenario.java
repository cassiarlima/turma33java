//Exemplo professor Ed- TENARIO
package lista2;

import java.util.Locale;
import java.util.Scanner;

public class ParImparSimplesTenario {

public static void main(String[] args) {
		
		//variaveis
		Locale.setDefault(Locale.US);
		Scanner ler= new Scanner(System.in);
		int N;
		String resposta;
		
		//entradas
		System.out.print("Digite o n�mero : ");
		N=ler.nextInt();
		
		//processamento e sa�da
		
		resposta = ((N%2)==0)? "NUMERO PAR": "NUMERO IMPAR";
		System.out.println(resposta);
				
}				
}
