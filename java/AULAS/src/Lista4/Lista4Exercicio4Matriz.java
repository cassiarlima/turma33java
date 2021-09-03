/*
 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.

 */

package Lista4;

import java.util.Scanner;

public class Lista4Exercicio4Matriz {
	
	public static void main (String[] args) {
		
		Scanner ler= new Scanner(System.in);
		
		int matriz [][]= new int [3][3];
		int somaValor =0, diagonal=0, x=0, y=0;
		
		for (x=0; x<3; x++) {
			for (y=0 ; y<3; y++) {
				System.out.println ("Informe o valor das matrizes na linha" +x+ "e na coluna"+y);
				matriz[x][y]= ler.nextInt();
				somaValor= somaValor + matriz[x][y];
				
			if (x==y) {
				diagonal= diagonal+matriz[x][y];
				}
			}
		}
		
		
		System.out.printf("A soma dos valores é : %d",somaValor,".");
		System.out.printf("A soma da diagonal principal é : %d",diagonal,".");
		
		
		
	}

}
