package Applications;

import Classes.Funcionario;
import Classes.Terceiro;

public class TestePolimorfismo {

	public static void main (String[] args) {
		
		Funcionario func1= new Funcionario("555", "Cássia", 500, 8);
		Terceiro terc1= new Terceiro("101", "Carla", 500, 8, 1.80);
		
		
		
		System.out.println(func1.toString()+"Salário R$"+func1.salario()+"Horas trabalhadas"+func1.getHorasTrabalhadas());
		System.out.println(terc1.toString()+"Salário R$"+terc1.salario()+"Horas trabalhadas"+terc1.getHorasTrabalhadas()+"Adicional R$"+terc1.getAdicional()+".");
		
		
		
		
	}

}
