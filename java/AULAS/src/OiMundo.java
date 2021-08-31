import java.util.Scanner;

public class OiMundo {

	public static void main (String[] args) {
		
		//variable
		Scanner leia = new Scanner(System.in);
		String nome;
		int AnoNascimento;
		int anoAtual=2021;
		
		//input
		System.out.println("Digite o nome : ");
		nome = leia.next();
		System.out.println("Digite o ano de nascimento : ");
		AnoNascimento= leia.nextInt();
		
		//out
		System.out.println(nome.toUpperCase()+", sua idade é "+(anoAtual-AnoNascimento)+" anos.");
		System.out.println("O tamanho de letras do seu nome é : "+nome.length());
		
		
			
		}
	}
	

