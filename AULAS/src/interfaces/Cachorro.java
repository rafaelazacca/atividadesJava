package interfaces;

public class Cachorro implements Animal{

	@Override
	public void somAnimal() {
		System.out.println("O som do cachorro: au au");
		
	}

	@Override
	public void dormir() {
		System.out.println("O cachorro dormindo: zzzZZz");
		
	}

	
}
