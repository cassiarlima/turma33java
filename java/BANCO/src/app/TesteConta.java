package app;

import entities.ContaEstudantil;

public class TesteConta {
	
	public static void main (String[] args) {
		
		ContaEstudantil cest1 =new ContaEstudantil(14,"123.45.789-55",1000);
		
		cest1.credito(50.25);
		System.out.println(cest1.toString());
		
		
	}

}
