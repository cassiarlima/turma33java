package lista1;
import java.util.Scanner;

////1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
//dias e mostre-a expressa apenas em dias.
public class Lista1JavaExercício1 {

	public static void main (String[] args) {
		
		//variaveis
		Scanner ler= new Scanner(System.in);
		int anos;
		int meses;
		int dias;
		int idade;
		String nome;
		
		//entradas
		System.out.println("Digite o seu nome : ");
		nome= ler.next();
		System.out.println("Quantos anos você tem ? : ");
		anos= ler.nextInt();
		System.out.println("Me informa também seus meses : ");
		meses= ler.nextInt();
		System.out.println("E agora seus dias : ");
		dias= ler.nextInt();
		
		//processamento
		idade= (anos*365)+(meses*30)+(dias*1);
		
		//saídas
		System.out.println("Olá, "+nome+ " você tem: "+idade+" dias vividos. Muito legal, né? >_<" );
		
	}	//fecha public static
} // fecha class
