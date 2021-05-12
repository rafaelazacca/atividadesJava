package interfaces;

public class TestaInterfaceAniamal {

	public static void main(String[] args) {
	
		
		Cachorro dog = new Cachorro();
		
		dog.somAnimal();
		dog.dormir();
		
		Gato cat = new Gato();
		
		cat.somAnimal();
		cat.dormir();
	}
	
}
