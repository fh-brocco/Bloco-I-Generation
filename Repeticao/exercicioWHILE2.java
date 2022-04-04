
/*Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos 
 * de uma região. Para tanto, a cada uma das pessoas era perguntado: idade, sexo 
 * (1-feminino / 2-masculino / 3-Outros), e as opções 
 * (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
 *  Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
o número de pessoas calmas; 
o número de mulheres nervosas; 
o número de homens agressivos; 
o número de outros calmos;
o número de pessoas nervosas com mais de 40 anos; 
o número de pessoas calmas com menos de 18 anos.
*/

package Repeticao;

import java.util.Scanner;

public class exercicioWHILE2 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int cont = 0, Calmas = 0, Nervosas = 0, Nervosos = 0, Outros = 0, JovensCalmos = 0, AdultosNervosos = 0,
				Total = 1, idade;
		char sexo, jeito;

		while (cont < 150) {
			cont++;
			System.out.printf("Individuo n.: " + (Total++ + "\n"));
			System.out.printf("Informe a idade: ");
			idade = ler.nextInt();
			System.out.printf("Informe se o sexo: (M/F/O) ");
			sexo = ler.next().charAt(0);
			System.out.printf("Informe se a pessoa e Calma(C), Nervosa(N), Agressiva(A)");
			jeito = ler.next().charAt(0);

			if (jeito == 'C') 
			{
				Calmas++;
			}
			if (sexo == 'F' && jeito == 'N') 
			{
				Nervosas++;
			}
			if (idade > 40 && jeito == 'N') 
			{
				AdultosNervosos++;
			}
			if (sexo == 'M' && jeito == 'A')
			{
				Nervosos++;
			}
			if (jeito == 'C' && idade < 18)
			{
				JovensCalmos++;
			}
			if (jeito == 'C' && sexo == 'O')
			{
				Outros++;
			}
			System.out.println("\n");
		    }
	           	System.out.printf("\n\nTotal de pessoas calmas: " + Calmas);
	        	System.out.printf("\nTotal de mulheres nervosas: " + Nervosas);
	        	System.out.printf("\nTotal de homens agressivos: " + Nervosos);
        		System.out.printf("\nTotal de outros calmos: " + Outros);
        		System.out.printf("\nTotal de jovens calmos: " + Calmas);
        		System.out.printf("\nTotal de idosos nervosos: " + AdultosNervosos);
	}
}

