/*
 * 3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto
 */
package lista2;

import java.util.Scanner;

public class Lista2Exercício3 {

	public static void main (String[] args) {
	
		//variaveis
		Scanner ler= new Scanner (System.in);
		int idade;
		
		//entradas
		System.out.print("Olá, informe sua idade : ");
		idade= ler.nextInt();
		
		//processamento e saída
		
		if (idade >=10  && idade <= 14){
			System.out.println("Você está na classe infantil.");
		}
		else if (idade >=15  && idade <= 17){
			System.out.println("Você está na classe juvenil.");
		}
		else {
			System.out.println("Você está na classe adulto.");
		}
				
	}
	
	
}

