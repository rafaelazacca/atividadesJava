package encapsulamento;

public class TestaCarro {
	
	public static void main(String[] args) {
	
		Carro02 car = new Carro02();
		
		car.setMarca("Fiat");
		car.setModelo("Siena");
		car.setNumPassageiros(5);
		
		
		System.out.println("A marca do carro é: " + car.getMarca());
		System.out.println("O modelo do carro é: " + car.getModelo());
		System.out.println("Quantidade de passageiros: " + car.getNumPassageiros());
		
		
		
	}
	

}
