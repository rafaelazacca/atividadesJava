package br.com.generation;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int segundos, minutos, horas, seg;
		
		System.out.println("Digite a dura��o do evento em segundos: ");
		segundos = leia.nextInt();

		
		horas = (segundos / 3600);
		minutos = ((segundos % 3600) / 60);
		seg = ((segundos % 3600) % 60); 

		System.out.println("O evento durou " + seg + " segundos " + minutos+ " minutos e "+ horas+ " horas");
		
		leia.close();
		
	}
}
