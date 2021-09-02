/*
 * 2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos de três e que se encontram no conjunto dos números de 1 até 500.

 */
package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class Lista3ExercícioPara {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler= new Scanner(System.in);
		
		int soma=0;
		int SomaDosPares3=500;
		
		for (int x=1; x<=SomaDosPares3; x++) {
			if ((x%2)==1 && (x%3)==0 ) {
				System.out.println("\n"+x);
		}
		}
	  System.out.print(soma);
		
		
		
		
	}
}
