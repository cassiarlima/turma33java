package lista1;
//3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
//expressa em segundos e mostre-o expresso em horas, minutos e segundos.

import java.util.Scanner;

public class Lista1Exerc�cio3Java {
	
	public static void main (String[] args) {
		
		Scanner ler= new Scanner(System.in);
		
		//variaveis
		int horas, minutos, segundos=0;
		
		//entradas
		System.out.println("Informe os segundos do evento na f�brica : ");
		segundos=ler.nextInt();
		
		//processamentos
		horas=(segundos/3600);
		minutos=((segundos%3600)/60);
		segundos=((segundos%3600)%60);
		
		//sa�das
		System.out.println("O evento durou "+horas+" horas, "+minutos+ "minutos e "+segundos+"segundos.");
			
	}//Fecha o public static	

}//Fecha o programa
