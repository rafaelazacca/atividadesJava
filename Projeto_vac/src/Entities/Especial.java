package Entities;

public class Especial extends Pessoa {
	private boolean especial;

	public Especial(String nome, String endere�o, boolean especial) {
		super(nome, endere�o);
		this.especial = especial;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}
	
	
}
