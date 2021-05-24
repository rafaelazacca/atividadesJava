package br.com.generation;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double custoFabrica, imposto, distribuicao, custoConsumidor;

		System.out.println("Qual é o custo de Fábrica: ");
		custoFabrica = leia.nextDouble();

		distribuicao = custoFabrica * 0.28;
		imposto = custoFabrica * 0.45;

		custoConsumidor = custoFabrica + imposto + distribuicao;

		System.out.println("O valor total do veículo é: "+ custoConsumidor);
		
		
		
		leia.close();
	}
}
