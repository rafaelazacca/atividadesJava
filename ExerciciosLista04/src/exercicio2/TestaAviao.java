package exercicio2;



public class TestaAviao {

	

		
		public static void main(String[] args) {
				
				//Instanciando um objeto
				
				Aviao av = new Aviao();
				
				
				av.modelo = "Boing";
				av.distancia = 1000;
				av.velocidade = 3000;
				av.qtdeLugares = 100;
				 
				
				av.informarModelo();
				av.mostrarVelocidade();
				av.calcularDistancia();
				av.mostrarQtdeLugares();
				
				
				
				
				System.out.println(av.modelo);
				System.out.println(av.qtdeLugares);	
				System.out.println(av.velocidade);
				System.out.println(av.distancia);
				

			}


}
