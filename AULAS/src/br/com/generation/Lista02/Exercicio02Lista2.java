package br.com.generation;

import java.util.Scanner;

public class Exercicio02Lista2 {
	
	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	int numero1, numero2, numero3;
	
	System.out.println("Digite 3 n�meros: ");
	numero1 = leia.nextInt();
	numero2 = leia.nextInt();
	numero3 = leia.nextInt();
	
	if(numero1 <= numero2 && numero2 <= numero3)
	{
		System.out.println("A ordem crescente �: " + numero1 + numero2 + numero3);
	}
	else if (numero1 <= numero3 && numero3 <= numero2)
	{
		System.out.println("A ordem crescente �: " + numero2 + numero1 + numero3); 
	}
	else if (numero2 <= numero3 && numero3 <= numero1)
	{
		System.out.println("A ordem crescente �: " + numero2 + numero2 + numero1);
	
	}
	else if (numero3 <= numero1 && numero1 <= numero2)
	{
		System.out.println("A ordem crescente �: " + numero3 + numero2 + numero1);
	}
	else {
		System.out.println("A ordem crescente �: " + numero3 + numero2 + numero1);
	}
	leia.close();
	}
}
