package classes;

public class Carro {

	String nome;
	String marca;
	int ano;
	int velocidade;
	
	//M�todos - A��es que meu carro tem 
	void acelerar(int aceleracao)
	{
		velocidade = velocidade + aceleracao;
	}
	void freiar (int reduzir)
	{
		velocidade = velocidade - reduzir;
	}
}
