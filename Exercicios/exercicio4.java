
/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. 
  Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.*/

package Exercicios;

import java.util.Scanner;

public class exercicio4 
{

	public static void main(String[] args) 
	{
	  Scanner num = new Scanner(System.in);
	  
	  int x,y;
	  
	  System.out.println("Entre com o primeiro n�mero: ");
	  x=num.nextInt();
	  y=x%2;
	 
	  if(y==0)
	    {
			System.out.println("Este n�mero � par e sua raiz quadrada �:"+Math.sqrt(x));
		}
 
	  else
		{
			System.out.println("Este n�mero � �mpar e seu n�mero elevado ao quadrado �: "+(x*x));
		}
	 }
}
