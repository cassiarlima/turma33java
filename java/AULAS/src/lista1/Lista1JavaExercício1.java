package lista1;
import java.util.Scanner;

////1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
//dias e mostre-a expressa apenas em dias.
public class Lista1JavaExerc�cio1 {

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
		System.out.println("Quantos anos voc� tem ? : ");
		anos= ler.nextInt();
		System.out.println("Me informa tamb�m seus meses : ");
		meses= ler.nextInt();
		System.out.println("E agora seus dias : ");
		dias= ler.nextInt();
		
		//processamento
		idade= (anos*365)+(meses*30)+(dias*1);
		
		//sa�das
		System.out.println("Ol�, "+nome+ " voc� tem: "+idade+" dias vividos. Muito legal, n�? >_<" );
		
	}	//fecha public static
} // fecha class
