package br.com.generation;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int dia, meses, anos;
		int dias;

		System.out.println("Digite sua idade em dias: ");
		dias = leia.nextInt();

		anos = dias / 365; 
		meses = (dias % 365) / 30;
		dia = (dias % 365) % 30;

		System.out.println("Voc� t�m: " + anos+ " anos,"+ meses + " meses e " + dia + " dias");

		leia.close();
		
	}

		
}


