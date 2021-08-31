package lista1;
//3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
//expressa em segundos e mostre-o expresso em horas, minutos e segundos.

import java.util.Scanner;

public class Lista1Exercício3Java {
	
	public static void main (String[] args) {
		
		Scanner ler= new Scanner(System.in);
		
		//variaveis
		int horas, minutos, segundos=0;
		
		//entradas
		System.out.println("Informe os segundos do evento na fábrica : ");
		segundos=ler.nextInt();
		
		//processamentos
		horas=(segundos/3600);
		minutos=((segundos%3600)/60);
		segundos=((segundos%3600)%60);
		
		//saídas
		System.out.println("O evento durou "+horas+" horas, "+minutos+ "minutos e "+segundos+"segundos.");
			
	}//Fecha o public static	

}//Fecha o programa
