package app;

import java.util.Scanner;

import entities.Conta;

public class ProgramaTeste {

	public static void main(String[] args) {
	
		//Conta cli1= new Conta(113, "x11.254.589-74"); // instanciar - usar ou criar objeto usando a classe.
		Scanner leia = new Scanner(System.in);
		boolean ativo;
		
		
		System.out.println("Informe o número da conta");
		int numeroConta= leia.nextInt();
		System.out.println("Digite o cpf da conta");
		String cpfConta= leia.next();
		Conta cli1= new Conta(numeroConta, cpfConta);
		
		
		cli1.credito(100.25);
		
		
		System.out.println(cli1.toString());
		System.out.println("Pagando boletos");
		cli1.debito(15);
		System.out.println(cli1.toString());
		
		/*
		 * System.out.println("Informe o número da conta 2");
			numeroConta= leia.nextInt();
		System.out.println("Digite o cpf da conta 2");
		cpfConta= leia.next();
		System.out.println("Conta ativa : 1- ativo - ativo 2- inativa");
		char op=leia.next().charAt(0);
		if (op=='1') {
			ativo=true;
		}
		else {
			ativo=false;
		}
			Conta cli2= new Conta(numeroConta, cpfConta,ativo);
		
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		cli1.toString();
		

	}

}
