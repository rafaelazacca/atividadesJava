package Entities;

public class Profissao extends Pessoa {
	private boolean profissao;

	public Profissao(String nome, String endereço, boolean profissao) {
		super(nome, endereço);
		this.profissao = profissao;
	}

	public boolean isProfissao() {
		return profissao;
	}

	public void setProfissao(boolean profissao) {
		this.profissao = profissao;
	}
	
	public void vacinaProfissao() {
		
	}
}
