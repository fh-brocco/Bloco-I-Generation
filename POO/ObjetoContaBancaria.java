package POO;

import java.util.Scanner;

public class ObjetoContaBancaria {

	public static void main(String[] args) {
		ClasseContaBancaria cliente = new ClasseContaBancaria();
		Scanner ler = new Scanner (System.in);
		
			
		cliente.cod = 2022;
		cliente.nome = "Fernando Brocco";
		cliente.saldo = 500.00;
		
		cliente.verificaUsuario();
		System.out.println("\n"+"Qual o valor do Saque?"+"\n");
		cliente.saldo = ler.nextDouble();
		cliente.debito(0);
		
		System.out.println();
		
	}

}
