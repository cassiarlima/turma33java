package Classes;

public class Eletronico {


		public String marca;
		public boolean ligado = false;

		public void eletronicoAtivado() {
			System.out.println("O aparelho eletronico da " + marca + " est� ligado");
			ligado = true;
		}

		public void eletronicoDesativado() {
			System.out.println("O aparelho eletronico da " + marca + " est� desligado");
			ligado = false;
		}
	}

