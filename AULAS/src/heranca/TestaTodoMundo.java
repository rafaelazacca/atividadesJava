package heranca;

public class TestaTodoMundo {
	
	public static void main(String[] args) {
		
		//Instanciar
		Professor prof = new Professor();
		Aluno alune = new Aluno();
		FuncAdm func1 = new FuncAdm();
		
		
		prof.setNome("Jeff");
		prof.setSalario(1000);
		
		alune.setNome("Renan");
		alune.setCurso("Ciência da computação");
		
		func1.setNome("Tatiana");
		func1.setSalario(2000);
		func1.setFuncao("Psiclogoga");
		
		System.out.println("Dados do Professor");
		System.out.println("Nome do professor: " + prof.getNome());
		System.out.println("Salario: " + prof.getSalario());
		
		System.out.println("Dados do Aluno");
		System.out.println("Nome do Aluno: " + alune.getNome());
		System.out.println("Curso: " + alune.getCurso());
		
		System.out.println("Dados do Funcionário");
		System.out.println("Nome do funcionário: " + func1.getNome());
		System.out.println("Salario: " + func1.getSalario());
	}
	

}
