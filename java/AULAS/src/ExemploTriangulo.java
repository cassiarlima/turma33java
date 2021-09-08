import java.util.Scanner;

public class ExemploTriangulo {

	public static void main (String[] args) {
		
		double a, b, c, d, e, f;
		Scanner leia = new Scanner (System.in);
		System.out.println("Escreva qual a altura do primeiro triangulo: ");
		a = leia.nextDouble();
		System.out.println("Escreva qual a base do primeiro triangulo ");
		b = leia.nextDouble();
		
		c=(a*b)/2;

		System.out.println("Escreva qual a altura do segundo triangulo: ");
		d = leia.nextDouble();
		System.out.println("Escreva qual a base do segundo triangulo ");
		e = leia.nextDouble();

		f=(d*e)/2;
		
		if (c>f) {
			System.out.println("O area do maior triangulo é de: " + c);
			
		}
		else {
			System.out.println("O area do maior triangulo é de: " + f);
		}

	
	
	}
}
