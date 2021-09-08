package Classes;

public class Clientes {
	

		//Atributos
		public String nome;
		public int idade;
		public String cpf;
		
		public boolean negativado = false;
		
		//Lista o cliente
		public void listaCliente(){
			System.out.println(nome);
		}
		//Lista o cliente negativado
		public void listarClienteNegativado(){
			negativado = true;
		}
		//Lista o cliente positivo
		public void listarClientePositivo(){
			negativado = false;
		}
	}


