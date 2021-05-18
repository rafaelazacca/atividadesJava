package Project_Vac;


	import java.util.Scanner;

	public class Profissao extends Pessoa implements Condicao_Vac {
		
		private int profissoes;
		
		Scanner ler = new Scanner(System.in);

		public int getProfissoes() {
			return profissoes;
		}

		public void setProfissoes(int profissoes) {
			this.profissoes = profissoes;
		}
		
		@Override
		public int condicao(int i) {
			
			int resultado;
			
			if(i == 1) {
				resultado = 4;
			}
			else if (i == 2)
			{
				resultado = 3;
			}
			else if (i == 3)
			{
				resultado = 2;
			}
			else if (i == 4)
			{
				resultado = 1;
			}
			else
			{
				resultado = 0;
			}
			return resultado;	
		}

}
