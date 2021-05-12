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
		
		
		System.out.println("Nome: " + cao.getNome());
		System.out.println("Idade: " + cao.getIdade());
		cao.dadosCachorro();
		
		System.out.println("------------------------------");
		
		System.out.println("Nome: " + cavalo.getNome());
		System.out.println("Idade: " + cavalo.getIdade());
		cavalo.dadosCavalo();
		
		System.out.println("------------------------------");
		
		System.out.println("Nome: " + preguica.getNome());
		System.out.println("Idade: " + preguica.getIdade());
		preguica.dadosPreguica();
		
		
		
	}
	
	
}
