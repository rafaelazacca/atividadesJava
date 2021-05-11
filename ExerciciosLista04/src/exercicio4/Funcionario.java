package exercicio4;

public class Funcionario {
	
	//Atributos
	private String nome;
	private int cpf;
	private int codigo;
	
	//Construtores
	public Funcionario(String nome, int cpf, int codigo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.codigo = codigo;
	}

	//Encapsulamento
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	

}
