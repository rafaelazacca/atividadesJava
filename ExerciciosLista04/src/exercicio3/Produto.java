package exercicio3;

import java.util.Scanner;

public class Produto {
	// Atributos
	private String nome;
	private String marca;
	private double valor;
	
	
	//Construtores
	public Produto(String nome, String marca, double valor) {
	
		super();
		this.nome = nome;
		this.marca = marca;
		this.valor = valor;
	}
	// Encapsulamento - getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	// Métodos
	public void cadastrar() {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto: ");
		nome = leia.next();
		
		System.out.println("Digite a marca do produto: ");
		marca = leia.next();
		
		System.out.println("Digite o valor do produto: ");
		valor = leia.nextDouble();
		
		
		}
		public double mudaValor(double valorNovo) {
			return this.valor = valorNovo;
			
		}

}
