


	import java.util.Scanner;

	public class Exercicio04 {
	    
	    public static void imprimirMatriz(double M[][]) { // Funçao utilizada para impressão das 3 matrizes
	        for(int i = 0 ; i < M.length ; i++) {
	            System.out.print("\t|");
	            for(int j = 0 ; j < M[0].length ; j++) {
	                System.out.printf("%.2f%s",M[i][j],(j < M[0].length -1 ) ? "\t":"|");
	            }
	            System.out.println();
	        }
	    }
	    
	    public static void main(String[] args) {
	        
	        Scanner entrada = new Scanner(System.in);
	        
	        char comando;
	        int i, j, c, finalizador = 0;
	        double m1[][] = new double[2][2], m2[][] = new double[2][2], m3[][] = new double[2][2];
	        System.out.println("Insira os elementos da primeira matriz m1[2][2]:");
	        for(i = 0 ; i < m1.length ; i++) {
	            for(j = 0 ; j < m1[0].length ; j++) {
	                m1[i][j] = entrada.nextDouble();
	            }
	        }
	        
	        System.out.println("Insira os elementos da segunda matriz m2[2][0]:");
	        for(i = 0 ; i < m2.length ; i++) {
	            for(j = 0 ; j < m2[0].length ; j++) {
	                m2[i][j] = entrada.nextDouble();
	            }
	        } 
	        
	   }
}

