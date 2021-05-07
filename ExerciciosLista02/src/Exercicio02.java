import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		
		int contador, numeroPar = 0, numeroImpar = 0, numero = 0;
		
		for (contador=1;contador<=10;contador++)
		{
			Scanner leia = new Scanner(System.in);
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
				
			if(numero%2 == 0)
			{
			numeroPar = numeroPar + 1;	
			}
			else if(numero%2 != 0)
			{	
			numeroImpar = numeroImpar + 1;
			}
		
			leia.close();
		}
			System.out.printf("Números Pares: %d\nNúmeros Impares: %d", numeroPar, numeroImpar);
			
	}
	
}

			



