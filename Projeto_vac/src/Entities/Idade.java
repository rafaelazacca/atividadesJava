package Entities;

import java.util.Scanner;

public class Idade extends Pessoa {
	private int idade;

	public Idade(String nome, String endere�o, int idade) {
		super(nome, endere�o);
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
		System.out.println("Digite sua profiss�o");
		String profissao = leia.next();
		System.out.println("� especial? 1 para SIM e 2 para N�O");
		int opcao = leia.nextInt();
		if (opcao == 1) {
			System.out.println("Voc� est� apto a tomar a vacina pela idade e por ser especial.");
		} else {
			System.out.println("Voc� est� apto a tomar a vacina pela idade");
		}
		System.exit(0);
	}

}
