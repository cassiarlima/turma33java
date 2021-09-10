package Classes;

public class Cachorro {
	
		public Cachorro(String nome, int idade) {
			super();
			
		}

		public void correr() {
			System.out.println("Cachorro correndo....");
		}
		
		@Override
		public void emitirSom() {
			System.out.println("au au au au....");
		}

		@Override
		public void rolarChao() {
			System.out.println("Cachorro em rolando no chão...");
			
		}

		@Override
		public void emDuasPatas() {
			System.out.println("Cachorro em duas patas...");
			
		}
		
	}

}
