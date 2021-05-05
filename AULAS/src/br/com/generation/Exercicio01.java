package br.com.generation;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		
	
	Scanner leia = new Scanner(System.in);
	int idade, mes , dia;
	int diasVida;

	 System.out.println("Digite sua idade: "); 
	 idade = leia.nextInt();

	 System.out.println("Digite quantos meses: ");
	 mes = leia.nextInt();

	 System.out.println("Digite os dias: ");
	 dia = leia.nextInt();

	 diasVida = ((idade*365) + (mes*30)+dia);
	 System.out.println("Você tem " + diasVida +  " dias de vida.");

	 leia.close();
	}
}
