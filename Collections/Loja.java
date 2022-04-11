package Collections;

import java.util.*;

public class Loja {

	public static void main(String[] args) {

		String produto1 = "generico 1";
		String produto2 = "generico 2";
		String produto3 = "generico 3";
		int selecao, opcao;
		char resposta = ' ';
		
		Scanner read = new Scanner(System.in);
		selecao = read.nextInt();
		
		ArrayList<String> estoque = new ArrayList<>();
		{

			estoque.add(produto1);
			estoque.add(produto2);
			estoque.add(produto3);

		
do {
		

			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("                    Bem vindo ao Cine-Genflix                     ");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("\n");

			System.out.println("Os produtos disponiveis em estoque são: \r\n\n" + estoque);

			System.out.println("gostaria de remover ou adicionar um item?");
			System.out.println("Digite 1 para remover e 2 para adicionar");

			switch (selecao) {

			case 1: {
				System.out.println(estoque);

				estoque.remove(selecao);
			}
				break;
			case 2: {
				System.out.println();
				System.out.println("\nDeseja sair?\nDigite 's' para sair ou digite 'n' para retornar ao inicio.");
			}

			}
     }while (resposta != 's');
       System.out.println("hhhhhh");
}
	}
}
