package br.com.generation;

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a, b, c, d, j, f, x, y;
		
		System.out.println("Digite o valor de a: ");
		a = leia.nextDouble();
		
		System.out.println("Digite o valor de b: ");
		b = leia.nextDouble();
		
		System.out.println("Digite o valor de c: ");
		c = leia.nextDouble();
		
		System.out.println("Digite o valor de d: ");
		d = leia.nextDouble();
		
		System.out.println("Digite o valor de j: ");
		j = leia.nextDouble();
		
		System.out.println("Digite o valor de f: ");
		f = leia.nextDouble();
		
		x = ((c * j) - (b * f)) / ((a * j) - (b * d));
		
		y = ((a * f) - ((c * d)) / ((a * j) - (b * d)));
		
		System.out.println("O valor de x � " + x +"\nO valor de y �: " + y);
		
		leia.close();
	}

}
