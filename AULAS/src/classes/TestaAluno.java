package classes;

import classes.Aluno;

public class TestaAluno {
public static void main(String[] args) {
		
		//Instanciando um objeto
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		
		aluno1.nome = "Alex";
		aluno1.idade = 20;
		aluno1.curso = "Java Jr";
		
		aluno2.nome = "Patrik";
		aluno2.idade = 19;
		aluno2.curso = "Java Jr";
		
		aluno1.assistirAula();
		aluno1.fazerProva();
		aluno1.calcularNota();
		
		aluno2.assistirAula();
		aluno2.fazerProva();
		aluno2.calcularNota();
		
		
		System.out.println(aluno1.nome);
		System.out.println(aluno2.nome);	
		
		

	}


}
