
/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto
*/

package Exercicios;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) 
	{
       Scanner idade = new Scanner(System.in);
       
		int x;
				
		System.out.println("Digite a idade da pessoa: ");
		x=idade.nextInt();
		
		if(x>=10 && x<=14)
		{
			System.out.println("A pessoa está na categoria infantil");
		}
		else if(x>=15 && x<=17)
		{
			System.out.println("A pessoa está na categoria juvenil");
		}
		else if (x>=18 && x>=25)
		{
			System.out.println("A pessoa está na categoria adulto");
		}
		else
		{
			System.out.println("A pessoa está abaixo da idade");
		}
				
	}
}
