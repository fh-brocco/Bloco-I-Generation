
//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

package Repeticao;

import java.util.Scanner;

public class exercicioFOR2 {

	public static void main(String[] args) {
		Scanner entra = new Scanner(System.in);
		int num, Par = 0, Impar = 0;
		for (int x = 1; x <= 10; x++) {
			System.out.println("Entre com um numero: ");
			num = entra.nextInt();

			if (num % 2 == 0) {
				Par++;
			}
			if (num % 2 == 1) {
				Impar++;
			}
		}
		System.out.println("Os numeros pares sao:" + Par + "\n" + "e os numeros impares sao:" + Impar);
	}
}
