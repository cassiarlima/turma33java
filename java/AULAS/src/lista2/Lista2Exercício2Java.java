package lista2;
import java.util.Scanner;

/*
 * Faça um programa que entre com três números e coloque em ordem crescente.
 */
   public class Lista2Exercício2Java {

	public static void main (String[] args) {
		
		Scanner ler= new Scanner(System.in);
		int num1,num2,num3;
		int oD;
		//entrada
		System.out.print("Digite o primeiro número : ");
		num1=ler.nextInt();
		System.out.print("Digite o segundo número : ");
		num2=ler.nextInt();
		System.out.print("Digite o terceiro número : ");
		num3=ler.nextInt();
		
		//processamentos
		
		if(num2 < num1){
	        oD = num1;
	        num1 = num2;
	        num2 = oD;
	    }

	    if(num3 < num1){
	        oD = num1;
	        num1 = num3;
	        num3 = oD;
	    }

	    if(num3 < num2){
	        oD = num2;
	        num2 = num3;
	        num3 = oD;
	    }
	    
	    System.out.println(+num1+" "+num2+" "+num3+".");
	}
	
   }
   
	    

			
			
		
