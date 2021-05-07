
	import java.util.Scanner;

	public class Exercicio03 {

	    public static void main(String[] args) {
	        
	        Scanner entrada = new Scanner(System.in);
	        int i, j, maiores10 = 0, matriz[][] = new int[3][3];
	        
	        for(i = 0 ; i < matriz.length ; i++) {
	            for(j = 0 ; j < matriz[0].length ; j++) {
	                System.out.println("Digite o elemento que deseja inserir na matriz:");
	                matriz[i][j] = entrada.nextInt();
	                
	                if(matriz[i][j] > 10) {
	                    maiores10++;
	                }
	                
	            }
	        }
	        
	        System.out.println("A quantidade de elementos maiores que 10 na matriz é de " +
	                            maiores10 + " elementos.");
	    }
	    
	}

