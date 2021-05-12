package polimorfismo;

public class ImprimirAnimal {
	
	public static void main(String[] args) {
		
		TestaAnimal t = new TestaAnimal();
		
		t.fazerAnimalComer(new Cachorro());

		t.fazerAnimalComer(new Tigre());
		
		//t.fazerAnimalComer(new Animal());//Animal � classe abstrata n�o pode ser instanciada(novo objeto).  
	}//Interface n�o pode ser objeto.

}
