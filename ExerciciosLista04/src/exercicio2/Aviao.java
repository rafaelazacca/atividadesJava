package exercicio2;

import java.util.Scanner;

public class Aviao {

	// Atributos
	private String modelo; 
	private int velocidade;
	private int distancia;
	private int qtdeLugares;
	
	
	
	public Aviao(String modelo, int velocidade, int distancia, int qtdeLugares) {
		
		super();
		this.modelo = modelo;
		this.velocidade = velocidade;
		this.distancia = distancia;
		this.qtdeLugares = qtdeLugares;
	}


	//Encapsulamento
	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public int getVelocidade() {
		return velocidade;
	}



	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}



	public int getDistancia() {
		return distancia;
	}



	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}



	public int getQtdeLugares() {
		return qtdeLugares;
	}



	public void setQtdeLugares(int qtdeLugares) {
		this.qtdeLugares = qtdeLugares;
	}
	
	
	//M�todos / A��es 
	public void cadastro() {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o modelo do avi�o: ");
		modelo = leia.next();
		
		System.out.println("Digite a velocidade do avi�o: ");
		velocidade = leia.nextInt();
		
		System.out.println("Digite a dist�ncia percorrida pelo avi�o: ");
		distancia = leia.nextInt();
		
		System.out.println("Digite a quantidade de lugares do avi�o: ");
		qtdeLugares = leia.nextInt();
		
		
	}
	
		public void imprimirDados() {
		
		System.out.println("O modelo do avi�o �: " + modelo);
		System.out.println("A velocidade do avi�o �: " + velocidade);
		System.out.println("A dist�ncia percorrida pelo avi�o �: " + distancia);
		System.out.println("A quantidade de lugares do avi�o �: " + qtdeLugares);
		
		}
	
}
