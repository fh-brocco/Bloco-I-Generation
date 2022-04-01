
/*Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
  Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.*/

package Exercicios;

import java.util.Scanner;

public class exercicio4 
{

	public static void main(String[] args) 
	{
	  Scanner num = new Scanner(System.in);
	  
	  int x,y;
	  
	  System.out.println("Entre com o primeiro número: ");
	  x=num.nextInt();
	  y=x%2;
	 
	  if(y==0)
	    {
			System.out.println("Este número é par e sua raiz quadrada é:"+Math.sqrt(x));
		}
 
	  else
		{
			System.out.println("Este número é ímpar e seu número elevado ao quadrado é: "+(x*x));
		}
	 }
}
