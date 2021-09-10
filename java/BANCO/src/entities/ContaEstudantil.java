package entities;

public class ContaEstudantil extends Conta{
	//atributos
	private double limiteEstudantil;
	//construtores
	public ContaEstudantil(int numero, String cpf, double limiteEstudantil) {
		super(numero, cpf);
		this.limiteEstudantil = limiteEstudantil;
	}
	//encapsulamento
	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}
	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
	}
	//métodos
	@Override
	public String toString() {
		return "ContaEstudantil [limiteEstudantil=" + limiteEstudantil + "]";
	}
	
	
	
	
	
}
