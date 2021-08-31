import java.util.Scanner;

public class GrausJava {

	public static void main (String[] args) {
		
				//variaveis
				Scanner leia = new Scanner(System.in);
				String nome;
				double temperaturaCelsius;
				double temperaturaFahrenheit;
				
				//entradas
				System.out.println("Escreva seu nome :");
				nome= leia.next();
				System.out.println("Escreva a temperatura em Celsius: ");
				temperaturaCelsius= leia.nextDouble();
				
				//processamento
				temperaturaFahrenheit = ( 9* temperaturaCelsius + 32) /5;
				
				//saída
				System.out.println(nome+", a temperatura em Fahrenheit é :"+ temperaturaFahrenheit + "ºf");
		
		
	}
	
}
