package Exercicio1;

public class TestaAnimal {

	public static void main(String[] args) {
	
		
		Cachorro cao = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		cao.setNome("Rex");
		cao.setIdade(2);
		
		cavalo.setNome("Marcos");
		cavalo.setIdade(6);
		
		preguica.setNome("Flash");
		preguica.setIdade(8);
		
		
		System.out.println(cao.getNome());
		System.out.println(cao.getIdade());
		cao.dadosCachorro();
		
		System.out.println("------------------------------");
		
		System.out.println(cavalo.getNome());
		System.out.println(cavalo.getIdade());
		cavalo.dadosCavalo();
		
		System.out.println("------------------------------");
		
		System.out.println(preguica.getNome());
		System.out.println(preguica.getIdade());
		preguica.dadosPreguica();
		
		
		
	}
	
	
}
