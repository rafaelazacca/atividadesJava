package classes;

public class TestaCarro {
	
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		
		c1.nome = "Tempra";
		c1.marca = "Fiat";
		c1.velocidade = 60;
		c1.ano = 1998;
		
		System.out.println("Velocidade: " + c1.velocidade);
		
		c1.acelerar(20);
		System.out.println("Velocidade: " + c1.velocidade);
		
		c1.freiar(10);
		System.out.println("Velocidade atual: " + c1.velocidade);
		
	}

}
