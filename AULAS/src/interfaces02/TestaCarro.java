package interfaces02;

public class TestaCarro {
	
	public static void main(String[] args) {
		
		Carro ferrari = new Ferrari();
		
		ferrari.acelerar();
		
		Carro fusca = new Fusca();
		
		fusca.acelerar();
	}

}
