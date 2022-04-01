
/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/

package Exercicios;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
        
		Scanner num = new Scanner(System.in);
        
		int n1,n2,n3;
		int n=0;
		
		System.out.println("Entre com o primeiro número: ");
		n1=num.nextInt();
		
		System.out.println("Entre com o segundo número: ");
		n2=num.nextInt();
		
		System.out.println("Entre com o terceiro número: ");
		n3=num.nextInt();
		
		if(n1>n2)
			n=n1;
		
		else
			n=n2;
		
		if(n>n3)
			System.out.println("O maior número é: "+n);
		else
			System.out.printf("O número maior é: "+n3);
	}

}