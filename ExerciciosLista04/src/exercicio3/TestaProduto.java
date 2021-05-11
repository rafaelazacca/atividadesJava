package exercicio3;

import java.util.Scanner;

public class TestaProduto {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double valorNovo;
		Produto prod = new Produto(null, null, 0);
			
		prod.cadastrar();
		
		System.out.println("O nome do produto é: " + prod.getNome() + "\nA marca do produto é: " + prod.getMarca()
		+ "\nO valor do produto é: " + prod.getValor());
		
		System.out.println("Digite o novo valor: ");
		valorNovo = leia.nextDouble();
		
		prod.mudaValor(valorNovo);
		
		System.out.println("O nome do produto é: " + prod.getNome() + "\nA marca do produto é: " + prod.getMarca()
		+ "\nO valor do produto é: " + prod.getValor());
	}
}
