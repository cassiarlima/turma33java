package Classes;

public class Aviao {

		public String cor;
		public String empresa;
		public String destino;
		public int tanque;
		public int querosene = 10;
		
		public void abastecerAviao(){
			if(tanque < 5000){
				tanque= tanque + querosene;
			}
			
			
		}
		

	}

