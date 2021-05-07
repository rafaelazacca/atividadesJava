import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero = 0, soma = 0, media = 0, qtdaNumeros = 0;
			
		
		do
		{
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
					
		if (numero%3 ==0 && numero != 0)
		{
			soma = soma + numero;
			qtdaNumeros = qtdaNumeros + 1;
		}
		
		
		
		}while (numero != 0); 
		
			media = soma/qtdaNumeros;
			
			System.out.println("A média dos números digitados: " + media);
		
			leia.close();
	
	}
	
}
