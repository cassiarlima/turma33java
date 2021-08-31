package lista1;
import java.util.Scanner;

//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
//expressa em anos, meses e dias.
public class Lista1JavaExercício2 {
	
	public static void main (String[] args) {

		//variables
		Scanner ler= new Scanner(System.in);
		int anos;
		int meses;
		int dias;
		int idade;
		
		//Entradas
		System.out.println("Informe sua idade em dias : ");
		dias= ler.nextInt();
				
		//inputs
		anos= dias/365;
		meses= ((dias-(anos*365))/30);
		dias = (dias%365)%30;
		
		//outputs
		System.out.println("Você tem "+anos+ " anos, "+meses+ " meses "+dias+ " dias vividos. :)");
			
		
	}//fecha public static

}//fecha class
