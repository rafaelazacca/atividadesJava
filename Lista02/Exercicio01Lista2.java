package br.com.generation;

import java.util.Scanner;

//Fa?a um programa que receba tr?s inteiros e diga qual deles ? o maior

public class Exercicio01Lista2 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2, numero3, maiorNumero = 0;
		
		System.out.println("Digite o primeiro n?mero: ");
		numero1 = leia.nextInt();
		System.out.println("Digite segundo n?mero: ");
		numero2 = leia.nextInt();
		System.out.println("Digite terceiro n?mero: ");
		numero3 = leia.nextInt();
		
		if(numero1 > numero2 && numero1 > numero3) {
			maiorNumero = numero1;
			System.out.println("O maior n?mero ? " + maiorNumero);
		}
		
		else if (numero2 > numero1 && numero2 > numero3) {
			maiorNumero = numero2;
			System.out.println("O maior n?mero ? " + maiorNumero);
		}
		else {
			maiorNumero = numero3;
			System.out.println("O maior n?mero ? " + maiorNumero);
		}
		
		leia.close();
	}

}