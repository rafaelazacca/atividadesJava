
 import java.util.Scanner;

	public class Exercicio02 {
	    public static void main(String[] args) {
	        
	        Scanner entrada = new Scanner(System.in);
	        
	        int i, somapar = 0, somaimpar = 0, numero[] = new int[6];
	        
	        for(i = 0 ; i < numero.length ; i++) {
	            System.out.println("Insira um n�mero inteiro:");
	            numero[i] = entrada.nextInt();
	        }
	        
	        
	        System.out.println("\n== NUMEROS PARES ==\n");
	        for(i = 0 ; i < numero.length ; i++) {
	            if(numero[i]%2 == 0) {
	                System.out.print(numero[i] + "\t");
	                somapar += numero[i];
	            }
	        }
	        
	        System.out.println("\n\nA soma dos n�meros pares digitados � igual a: " + somapar);
	        System.out.println("\n== NUMEROS �MPARES ==\n");
	        for(i = 0 ; i < numero.length ; i++) {
	            if(numero[i]%2 != 0) {
	                System.out.print(numero[i] + "\t");
	                somaimpar += numero[i];
	            }
	        }
	        
	        System.out.println("\n\nA soma dos n�meros �mpares digitados � igual a: " + somaimpar);
	    }
	}

