
/*Escrever um programa que receba vários números inteiros no teclado. 
 * E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/

package Repeticao;

import java.util.Scanner;

public class exercicioDOWHILE2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num = 0, media = 0, soma = 0, cont = 0;

		do {
			System.out.println("Digite o numero: ");
			num = ler.nextInt();
			if (num % 3 == 0 && num != 0);
			{
				soma = soma + num;
				cont++;
			}
		} while (num != 0);
		{
			media = soma / cont;
			System.out.println("A media dos numeros e : " + media);
		}
	}
}