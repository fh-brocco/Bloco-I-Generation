
/*Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package POO;

import java.util.Scanner;

public class ObjetoAviao {

	
	public static void main(String[] args) {
		ClasseAviao a1= new ClasseAviao();
		Scanner ler = new Scanner (System.in);
		
		System.out.println("A manutenção está em dia? ");
		a1.manutencao=ler.nextBoolean();
		
		System.out.println("O avião é de passageiros? ");
		a1.tipo=ler.nextBoolean();
	   		
		a1.companhia="AeroGen";
				
		a1.modelo();
		a1.manut();
		a1.estado();
		
	}
}
