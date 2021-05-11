package classes;

public class Carro {

	String nome;
	String marca;
	int ano;
	int velocidade;
	
	//Métodos - Ações que meu carro tem 
	void acelerar(int aceleracao)
	{
		velocidade = velocidade + aceleracao;
	}
	void freiar (int reduzir)
	{
		velocidade = velocidade - reduzir;
	}
}
