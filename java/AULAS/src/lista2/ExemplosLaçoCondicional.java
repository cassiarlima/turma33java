//Exemplo professor ED
package lista2;

import java.util.Locale;
import java.util.Scanner;

public class ExemplosLaçoCondicional {

	public static void main(String[] args) {
		
		//variaveis
		Locale.setDefault(Locale.US);//perfumaria(Deixar em padronização americana os números)
		Scanner ler= new Scanner(System.in);//instância
		String nome;
		int anoNascimento,idade;
		
		//entrada
		System.out.println("Olá, informe o seu nome : ");
		nome=ler.next();
		System.out.println("Qual ano você nasceu ? ");
		anoNascimento= ler.nextInt();
		
		
		//processamentos
		
		idade = (2021 - anoNascimento);
		
		
		
		if(idade>45) {
			System.out.printf("%s sua idade é %d anos, você é cringe.",nome,idade);
		}
		
		else if (idade >= 18) {
			System.out.printf("%s sua idade é %d anos, você é adulto.",nome,idade);
			
		}
		else if (idade >= 13 ) {
			System.out.printf("%s sua idade é %d anos, você é adolescente.",nome,idade);
		}
		
		else if(idade==0){
			System.out.println("Recem-nascido!!");
		}
		
		
	}//fecha ponto de entrada

}//fecha programa

//Caso você use printf:
		//CLASSE:
		//cadeia = String %s
		//TIPO:
		//inteiro = int %d
		//real = double %f = %.2f
		//caracter= char %c
		//logico = boolean %b