package br.com.generation;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double x1, x2, y1, y2;  
		double d;

		System.out.println("digite o valor de x do primeiro ponto:\n");  
		x1 = leia.nextDouble();

		System.out.println("digite o valor de x do segundo ponto:\n");  
		x2 = leia.nextDouble();

		System.out.println("digite o valor de y do primeiro ponto:\n");  
		y1 = leia.nextDouble();

		System.out.println("digite o valor de y do segundo ponto:\n");  
		y2 = leia.nextDouble();

		d = ((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));

		System.out.println("a distância entre eles é: "+ d);
		
		 leia.close();
	}
}
