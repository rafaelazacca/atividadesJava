package br.com.generation;

import java.util.Scanner;

public class Exercicio03Lista2 {

public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.print("Digite sua idade: ");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("Voc� est� na categoria infantil!");
		}
		else if (idade >= 15 && idade <= 17) {
			System.out.println("Voc� est� na categoria juvenil!");
		}
		else if (idade >= 18 && idade <= 25) {
			System.out.println("Voc� est� na categoria adulto!");
		}
		else {
			System.out.println("Desculpe, n�o h� categorias para voc�.");
		}
		
		leia.close();
	}

}

