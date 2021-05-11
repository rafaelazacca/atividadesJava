package exercicio1;

import java.util.Scanner;

public class Cliente {
	
	//Atributos
	private String nome; 
	private String email;
	private int idade;
	private int telefone;
	private int cpf;
	
	// Construtores	
	public Cliente(String nome, String email, int idade, int telefone, int cpf) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.telefone = telefone;
		this.cpf = cpf;
	}
	
	// Encapsulamento
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public void cadastro() {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = leia.next();
		
		System.out.println("Digite seu email: ");
		email = leia.next();
		
		System.out.println("Digite seu idade: ");
		idade = leia.nextInt();
		
		System.out.println("Digite seu telefone: ");
		telefone = leia.nextInt();
		
		System.out.println("Digite seu cpf: ");
		cpf = leia.nextInt();
	}

	public void imprimirDados() {
		
		System.out.println("O nome do cliente é: " + nome);
		System.out.println("O email do cliente é: " + email);
		System.out.println("A idade do cliente é: " + idade);
		System.out.println("O telefone do cliente é: " + telefone);
		System.out.println("O cpf do cliente é: " + cpf);
		
	}
}
