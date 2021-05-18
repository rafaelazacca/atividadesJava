package Entities;

public class Profissao extends Pessoa {
	private boolean profissao;

	public Profissao(String nome, String endere�o, boolean profissao) {
		super(nome, endere�o);
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
