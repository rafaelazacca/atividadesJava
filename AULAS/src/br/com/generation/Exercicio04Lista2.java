package br.com.generation;

import java.util.Scanner;

public class Exercicio04Lista2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		double raiz;
		double quadrado;
		
		System.out.println("Digite um n�mero: ");
		numero = leia.nextInt();
		
		if(numero%2 == 0)
		{
			System.out.println("N�mero � par");
			raiz = Math.sqrt(numero);
			System.out.println("Raiz do n�mero: " + raiz);
		}
		
		else if(numero%2 ==1)
		{
			System.out.println("N�mero � impar");
			quadrado = Math.pow(numero, 2);
			System.out.println("O quadrado do n�mero �: " + quadrado);
		}
		leia.close();
	}
	
}
