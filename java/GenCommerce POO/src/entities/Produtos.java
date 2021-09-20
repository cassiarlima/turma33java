package entities;


	public class Produtos {

	    // atributos

	    public String codigoProduto;
	    public String nomeProduto;
	    public double valorProduto;
	    public int estoque;

	    // construtor

	    public Produtos(String codigoProduto, String nomeProduto, double valorProduto, int estoque) {
	   	 super();
	   	 this.codigoProduto = codigoProduto;
	   	 this.nomeProduto = nomeProduto;
	   	 this.valorProduto = valorProduto;
	   	 this.estoque = estoque;

	   	 // Encapsulamento = getters and setters

	    }

	    public String getCodigoProduto() {
	   	 return codigoProduto;
	    }

	    public void setCodigoProduto(String codigoProduto) {
	   	 this.codigoProduto = codigoProduto;
	    }

	    public String getNomeProduto() {
	   	 return nomeProduto;
	    }

	    public void setNomeProduto(String nomeProduto) {
	   	 this.nomeProduto = nomeProduto;
	    }

	    public double getValorProduto() {
	   	 return valorProduto;
	    }

	    public void setValorProduto(double valorProduto) {
	   	 this.valorProduto = valorProduto;
	    }

	    public int getEstoque() {
	   	 return estoque;
	    }

	    public void setEstoque(int estoque) {
	   	 this.estoque = estoque;
	    }

	    // metodos

	    public void mostrarNaTela() {

	   	 // MOSTRA A LISTA DE PRODUTOS

	   	 System.out.print("Código:\tLivros:\t                   	Valores:\tEstoque:\n");

	   	 System.out.print(this.codigoProduto + "\t" + this.nomeProduto + "\t" + this.valorProduto + "\t" + this.estoque + "\n");
	   	 

	    }

	    public void inserirEstoque(int valor) {

	   	 this.estoque = this.estoque + valor;

	    }
	 
	    @Override
		public String toString() {
			return  codigoProduto + "\t"+ nomeProduto + "\t"
					+ valorProduto + "\t" + estoque ;
		}

		public void retirarEstoque(int valor) {
	   	 
	   	 this.estoque = this.estoque - valor;
	    }
	    
	}

