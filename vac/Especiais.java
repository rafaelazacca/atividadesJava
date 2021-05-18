package Project_Vac;

public class Especiais extends Pessoa implements Condicao_Vac {
	private int especiais;

	public int getEspeciais() {
		return especiais;
	}

	public void setEspeciais(int especiais) {
		this.especiais = especiais;
	}
	
	@Override
	public int condicao(int i) 
	{
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
