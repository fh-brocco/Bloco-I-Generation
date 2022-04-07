
/*Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/

package POO;

import java.util.Scanner;

public class ObjetoProdutoEletronico {

	public static void main(String[] args) {
		ClasseProdutoEletronico x1= new ClasseProdutoEletronico();
		Scanner ler =  new Scanner (System.in);
				
		System.out.println("Qual o aparelho? "+"\t");
		x1.aparelho=ler.next();
		System.out.println("Qual o modelo?"+"\t");
		x1.modelo=ler.next();
		System.out.println("Esta em bom estado?"+"\t");
		x1.condicao = ler.nextBoolean();
				
		x1.ano=2020;
		x1.escrever();
		x1.estado();
	}

}
