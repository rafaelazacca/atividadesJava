package br.com.generation;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
	
		double nota1, nota2, nota3, media; 

		System.out.println("Digite nota 1: ");
		nota1 = leia.nextInt();

		System.out.println("Digite nota 2: ");
		nota2 = leia.nextInt();

		System.out.println("Digite nota 3: ");
		nota3 = leia.nextInt();

		media = ((nota1*2) + (nota2*3) + (nota3*5)) /10;
		System.out.println("A média ponderada é: " + media);
	
		leia.close();
	}
	

}
