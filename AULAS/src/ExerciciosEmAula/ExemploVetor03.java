package ExerciciosEmAula;

import java.util.Scanner;

public class ExemploVetor03 {
	
	public static void main(String[] args) {
		
			Scanner leia = new Scanner(System.in);
	
			double [] notas = new double[4];
			double soma = 0.0, media = 0.0;
			
			int i; 
			 
			System.out.println("Digite a nota do aluno: \n");
			 
			 for(i = 0;i<= 3;i++)
			 {
				 notas[1] = leia.nextDouble();
			 }
			 for(i= 0;i<= 3;i++)
			 {
				 soma = soma + notas[1];
				 media = soma/4;
			 }
			 System.out.println("A soma das notas é: " + soma);
			 System.out.println("A média é: " + media);
	
	
	
	}
	
}
