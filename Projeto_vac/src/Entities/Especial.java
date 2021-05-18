package Entities;

public class Especial extends Pessoa {
	private boolean especial;

	public Especial(String nome, String endereço, boolean especial) {
		super(nome, endereço);
		this.especial = especial;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}
	
	
}
