package ExerciciosEmAula;

public class ExemploVetor02 {
	
	public static void main(String[] args) {
		
		double [] temperaturas = new double [5];
		
		temperaturas [0] = 32.0;
		temperaturas [1] = 28.5;
		temperaturas [2] = 25.0;
		temperaturas [3] = 40.0;
		temperaturas [4] = 9.0;
		
		//System.out.println("O valor da temperatura no dia 1: " + temperaturas[0]);
		//System.out.println("O tamanho do array: " + temperaturas.length);
		
		
		System.out.println("Os valores do array: ");
		
		for(int i = 0;i<temperaturas.length; i++)
		{
			System.out.println("O valor da temperatura no dia 1: " 
					+ (i+1) + " é: " + temperaturas[i]);
			
		}
	}

}
