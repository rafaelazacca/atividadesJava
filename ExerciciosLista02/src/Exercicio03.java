import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		int idade = 0, menor = 0, maior = 0;
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		while(idade!= -99)
		{
			System.out.println("Digite sua idade: ");
			
			idade = leia.nextInt();
		
			if(idade<21)
			{
				menor = menor + 1;
			}
			else if(idade>50)
			{
				maior = maior + 1;
			}
			
		}
		System.out.println("Número de pessoas com menos de 21 anos: " + menor);
		System.out.println("Número de pessoas com mais de 50 anos: " + maior);
		
		leia.close();
	}

}
