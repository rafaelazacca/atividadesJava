package Application;

import java.util.Scanner;

import Entities.Idade;
import Entities.Pessoa;

public class Application {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Pessoa pessoa = new Pessoa(null, null);
		Idade idade1 = new Idade(null, null, 0);

		System.out.println("Seja bem vindo ao sistema de cadastramento para vacinas.");
		System.out.println("Digite seu nome");
		pessoa.setNome(leia.nextLine());
		System.out.println("Agora digite seu endere�o");
		pessoa.setEndere�o(leia.nextLine());
		System.out.println("Digite sua idade");
		int idade = leia.nextInt();

		if (idade > 60) {
			idade1.vacinaIdade(idade);
			// System.out.println("vacina para idosos");

		} else {

		}

		System.out.println("\nQual � sua profiss�o?");	
		System.out.println("[1]�rea da Sa�de\n[2]Motoristas/Cobrador\n[3]Profissional da Educa��o\n[4]Profissional da Seguran�a P�blica");
		int opcao = leia.nextInt();
		while (opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4) {
			// vacinaProfissao();
			System.out.println("vacina profissao");
			break;
		}

		System.out.println("Possui alguma doen�a que requer a vacina ou est� gr�vida? Digite 1 para SIM ou 2 para N�O");
		int opcao2 = leia.nextInt();
		if (opcao2 == 1) {
			// vacinaEspecial();
			System.out.println("vacina gravida");
		} else {

		}

	}
}
