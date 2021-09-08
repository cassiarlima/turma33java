package Applications;

import Classes.Clientes;

public class ApplicationCliente {

	
public static void main(String[] args) {
		
		Clientes cliente1 = new Clientes();
		
		cliente1.nome = "Cássia";
		cliente1.idade = 22;
		cliente1.cpf = "42568416";
		cliente1.negativado = true;
		
		Clientes cliente2 = new Clientes();
		
		cliente2.nome = "Abel";
		cliente2.idade = 23;
		cliente2.cpf = "5982065";
		cliente2.negativado = false;
		
		if(cliente1.negativado == true){
			System.err.println(cliente1.nome);
			System.out.println("Esse cliente está negativado!");	
		} 
		
		else if(cliente1.negativado == false) {
			System.err.println(cliente2.nome);
			System.out.println("Esse cliente está positivo");
		}
		

	}

}
