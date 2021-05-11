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
	
	
	//Métodos / Ações 
	public void cadastro() {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o modelo do avião: ");
		modelo = leia.next();
		
		System.out.println("Digite a velocidade do avião: ");
		velocidade = leia.nextInt();
		
		System.out.println("Digite a distância percorrida pelo avião: ");
		distancia = leia.nextInt();
		
		System.out.println("Digite a quantidade de lugares do avião: ");
		qtdeLugares = leia.nextInt();
		
		
	}
	
		public void imprimirDados() {
		
		System.out.println("O modelo do avião é: " + modelo);
		System.out.println("A velocidade do avião é: " + velocidade);
		System.out.println("A distância percorrida pelo avião é: " + distancia);
		System.out.println("A quantidade de lugares do avião é: " + qtdeLugares);
		
		}
	
}
