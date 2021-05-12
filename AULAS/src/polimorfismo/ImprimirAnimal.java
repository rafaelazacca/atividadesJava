package polimorfismo;

public class ImprimirAnimal {
	
	public static void main(String[] args) {
		
		TestaAnimal t = new TestaAnimal();
		
		t.fazerAnimalComer(new Cachorro());

		t.fazerAnimalComer(new Tigre());
		
		//t.fazerAnimalComer(new Animal());//Animal é classe abstrata não pode ser instanciada(novo objeto).  
	}//Interface não pode ser objeto.

}
