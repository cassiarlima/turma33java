package Applications;

import Classes.Funcionario;
import Classes.Terceiro;

public class TestePolimorfismo {

	public static void main (String[] args) {
		
		Funcionario func1= new Funcionario("555", "C�ssia", 500, 8);
		Terceiro terc1= new Terceiro("101", "Carla", 500, 8, 1.80);
		
		
		
		System.out.println(func1.toString()+"Sal�rio R$"+func1.salario()+"Horas trabalhadas"+func1.getHorasTrabalhadas());
		System.out.println(terc1.toString()+"Sal�rio R$"+terc1.salario()+"Horas trabalhadas"+terc1.getHorasTrabalhadas()+"Adicional R$"+terc1.getAdicional()+".");
		
		
		
		
	}

}
