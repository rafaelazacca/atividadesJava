package exercicio4;

public class TestaFuncionario {
	
	public static void main(String[] args) {
		

		
		Funcionario func1 = new Funcionario("Caio", 38278466, 1);
		Funcionario func2 = new Funcionario("Marcelo", 56783833, 2);
		Funcionario func3 = new Funcionario("Mayara", 12398837, 3);
		
		System.out.println(func1.getNome()+ " " + func1.getCpf()+" " + func1.getCodigo());
		
		System.out.println(func2.getNome()+ " " + func2.getCpf()+" " + func2.getCodigo());
		
		System.out.println(func3.getNome()+ " " + func3.getCpf()+" " + func3.getCodigo());
	}
	

}
