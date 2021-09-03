package Lista4;

import java.util.Locale;
import java.util.Scanner;

public class lista4Exemplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Locale.setDefault(Locale.US);
		Scanner leia= new Scanner (System.in);
		
		//String nome[] = new String [4]; uma forma de fazer
		String nome[] = {"Marcos", "Paulo", "Pedro", "José"}; // outra forma de fazer
		int notas [] = new int[4];
		
		System.out.println("Tamanho do vetor"+nome.length);
		
		for (int x = 0; x<nome.length ;x++){
			System.out.print("Alune : "+nome[x]+ " informe a nota : ");
			notas[x]= leia.nextInt();
		}
		
		

	}

}
