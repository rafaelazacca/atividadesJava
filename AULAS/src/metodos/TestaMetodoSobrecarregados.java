package metodos;

public class TestaMetodoSobrecarregados {

	public static void main(String[] args) {
		
		MinhaCalculadora mc = new MinhaCalculadora();
		
		//Soma dois n�meros inteiros
		System.out.println(mc.soma(20, 30));
		
		//Soma tr�s n�meros inteiros
		System.out.println(mc.soma(250, 250, 250));
		
		//Soma dois n�meros doubles
		System.out.println(mc.soma(3.6, 6.7));
	}
}
