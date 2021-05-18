package Entities;

import java.util.Scanner;

public class Idade extends Pessoa {
	private int idade;

	public Idade(String nome, String endereço, int idade) {
		super(nome, endereço);
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void vacinaIdade(int idade) {
		Scanner leia = new Scanner(System.in);
		this.idade = idade;
		System.out.println("Digite sua profissão");
		String profissao = leia.next();
		System.out.println("é especial? 1 para SIM e 2 para NÃO");
		int opcao = leia.nextInt();
		if (opcao == 1) {
			System.out.println("Você está apto a tomar a vacina pela idade e por ser especial.");
		} else {
			System.out.println("Você está apto a tomar a vacina pela idade");
		}
		System.exit(0);
	}

}
