package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class Lista3ExemploLaço {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler= new Scanner(System.in);
	
		String alune;
		double nota=0.00;
		char pronome;
		double media=0.00;
		double totalNotas=0.00;
		double maiorNota=0.00;
		
		System.out.print("Digite o seu nome : ");
		alune=ler.next();
		System.out.print("Qual o pronome O/A/E :  ");
		pronome = ler.next().toUpperCase().charAt(0);
		if (pronome == 'O') {
			System.out.printf("Bom dia, aluno %s!!",alune);
		}
		else if (pronome=='A') {
			System.out.printf("Bom dia, aluna %s !!",alune);
		}
		else if (pronome=='E') {
			System.out.printf("Bom dia, alune%s!!",alune);
		}
		else {
			System.out.println("Código inválido, vou usar o pronome neutro! ");
		}
		
		for (int x=1; x<=4; x++) {
			System.out.print("\nDigite a nota " +x+" : ");
			nota=ler.nextDouble();
			totalNotas = totalNotas + nota;
			if (nota > maiorNota) {
				maiorNota=nota;
			}
		}
		
		media = (totalNotas /4);
		
		System.out.printf("\nOLÁ ALUN%c %s, SUA MÉDIA DE NOTAS FOI %.2f !!",pronome,alune,media);
		System.out.printf("\nSua maior nota foi %.2f",maiorNota);
		
		
		
	}
}
