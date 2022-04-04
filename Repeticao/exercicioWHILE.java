
/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)*/

package Repeticao;

import java.util.Scanner;

public class exercicioWHILE {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade = 0, Jovem = 0, Adulto = 0;

		while (idade != -99) {
			System.out.println("Digite a idade: ");
			idade = ler.nextInt();

			if (idade >= 50) {
				Adulto++;
			} else if (idade < 21 && idade > -99) {
				Jovem++;
			}
		}
		System.out.println("Total de pessoas com menos de 21 anos: " + Jovem);
		System.out.println("Total de pessoas com mais de 50 anos: " + Adulto);
	}
}
