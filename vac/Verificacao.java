package Project_Vac;

import java.util.Random;
import java.util.Scanner;

public class Verificacao {

public static void main(String[] args) {
		
		Scanner l = new Scanner(System.in);
		
		Especiais esp = new Especiais();
		Idade id = new Idade();		
		Pessoa pe = new Pessoa();
		Profissao prof = new Profissao();
		
		int linha = 1;//quantidade de cadastros
		String [][] agenda = new String [linha][3];
		int dia, mes, ano = 2021;
		int li, c;
		int prioridade = 1; 
		
		Random gera = new Random(); // Classe Java que dentro dele tem uma fun��o de gerar numeros aleat�rios
		
		System.out.println("========================================================");
		System.out.println("                      Sys - Vac");
		System.out.println("========================================================");
		System.out.println("   Sistema de cadastro para idades entre 0 e 59 anos"
				+" \n      Se voc� possui idade superior, ligue 1599"
				+" \n========================================================");
		
		//anda as linhas
		for(li = 0; li<agenda.length; li++) {
			
			int aux =0;
		
			// Inser��o de dados
			System.out.print("Nome: ");		
			pe.setNome(l.next()); //  nome
			//System.out.println(pe.getNome());
			
			System.out.print("Endere�o: "); // endere�o
			pe.setEndere�o(l.next());
			
			System.out.print("Idade: ");
			id.setIdade(l.nextInt());  //  idade
			aux =id.getIdade();
			
			System.out.println(aux);
			
			if(aux<60){
			
			System.out.print("Prioridade: " + id.condicao(id.getIdade()));
			
			System.out.println("\nQual � sua profiss�o?");	
			System.out.println("[1]�rea da Sa�de\n[2]Motoristas/Cobrador\n[3]Profissional da Educa��o\n[4]Profissional da Seguran�a P�blica"
					+ "\n[0]Outros ou Nenhum");
			prof.setProfissoes(l.nextInt());
			
			System.out.print("Prioridade: " + prof.condicao(prof.getProfissoes()));
			
			System.out.println("\nPossui alguma doen�a?");	
			System.out.println("[1]Sindrome de Down\n[2]Problemas renais em di�lise\n[3]Transplantados Imunossuprimidos\n[4]Gr�vidas e Pu�peras com comorbidades\n[5]BPC\n[0]Nenhuma das Op��es");
			esp.setEspeciais(l.nextInt());
			
			System.out.println(esp.condicao(esp.getEspeciais())); 
			
			

			/********************   prioridade    ****************************/	
			//ser� recuperado no cadastro de cada pessoa			
			prioridade = (id.condicao(id.getIdade())); 
			
			if ( prioridade < prof.condicao(prof.getProfissoes())){
					prioridade = prof.condicao(prof.getProfissoes());
			}
			else if (prioridade < esp.condicao(esp.getEspeciais()) ) {			
			  	    prioridade = esp.condicao(esp.getEspeciais());
			}
			
			/********************   prioridade    ****************************/	
		
				
			
			
			/****************************** Gera data ********************************/
			//                  ou
			if (prioridade == 5 || prioridade == 4) { //se a prioridade for 4 ou 5
				//					MAX - MIN        MIN
				mes = gera.nextInt((7 - 5) +    1) + 5; //gera um m�s entre 05 e 08
				
			}else if (prioridade == 3 || prioridade == 2) { ////se a prioridade for 4 ou 5
				mes = gera.nextInt((10 - 8) + 1) + 8; //gera um m�s entre 09 e 10
				
			}else {					
				mes = gera.nextInt((12 - 11) + 1) + 11; //gera um m�s entre 11 e 12
			}				
			
			if (mes == 5){// se cair no m�s atual	gerar o dia que n�o passou				
				dia = gera.nextInt(30) + 15;//gerando um dia aleat�rio
			}
			else {
				dia = gera.nextInt(30) + 1;//gerando um dia aleat�rio*/
				
			}	
			
			
			/****************************** Fim Gera data ********************************/	
			
			//anda as colunas
			for(c = 0; c < agenda[li].length; c++) {		
				
				/********************   preenche as colunas    ****************************/	
				if (c == 0)//adiciona data
					agenda[li][c] = dia+"/"+mes+"/"+ano;
				else if(c == 1)//adiciona o nome
					agenda[li][c] = pe.getNome();
				else //adiciona prioridade
					agenda[li][c] = Integer.toString(prioridade);
				}
			
		
		

		for(li = 0; li<agenda.length; li++) {
			for(c = 0; c < agenda[li].length; c++) {
				if (c == 0)//adiciona data
						System.out.println("Data: " +  agenda[li][c] + " nome: " +  agenda[li][c+1] + " Prioridade: " + agenda [li][c+2]);	
			}
			
		}	
			}else {
				System.out.println("========= Voc� possui idade superior, ligue 1599 =========");
			}

		}
	}
}
