import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int idade, sexo, temperamento, i=1, calma=0, nervosa=0, agressiva=0, nervosa1=0, calma1=0;

        System.out.printf("Digite sua idade: ");
        idade = ler.nextInt();

        System.out.printf("Digite seu sexo (1-feminino / 2-masculino / 3-Outros): ");
        sexo = ler.nextInt();

        System.out.printf("Digite 1, se você é uma pessoa calma; 2, se é uma pessoa nervosa e 3, se é uma pessoa agressiva: ");
        temperamento = ler.nextInt();
        while(i<4) {
            i++;

            if(temperamento == 1) {
                calma++;
            }
            else if(sexo == 1 && temperamento == 2) {
                nervosa++;
            }
            else if(sexo == 2 && temperamento == 3) {
                agressiva++;
            }
            else if(idade > 40 && temperamento == 2) {
                nervosa1++;
            }
            else if(idade < 18 && temperamento == 1) {
                calma1++;
            }
            System.out.printf("Digite sua idade: ");
            idade = ler.nextInt();

            System.out.printf("Digite seu sexo (1-feminino / 2-masculino / 3-Outros): ");
            sexo = ler.nextInt();

            System.out.printf("Digite 1, se você é uma pessoa calma; 2, se é uma pessoa nervosa e 3, se é uma pessoa agressiva: ");
            temperamento = ler.nextInt();
        }
        System.out.println("O número de pessoas calmas é: " + calma);
        System.out.println("O número de mulheres nervosas é: " + nervosa);
        System.out.println("O número de de homens agressivos é: " + agressiva);
        System.out.println("O número de pessoas nervosas com mais de 40 anos é: " + nervosa1);
        System.out.println("O número de pessoas calmas com menos de 18 anos é: " + calma1);

        ler.close();
    }

}

