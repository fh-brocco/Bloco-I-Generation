package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Lojinha {

	public static void main(String[] args) {

		String produto1 = "generico 1";
		String produto2 = "generico 2";
		String produto3 = "generico 3";
		String adicionar;
		int selecao, opcao;
		char resposta = ' ';

		Scanner ler = new Scanner(System.in);

		ArrayList<String> estoque = new ArrayList<>();

		estoque.add(produto1);
		estoque.add(produto2);
		estoque.add(produto3);

		do {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("                   Mercadinho virtual                    ");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("\n");

			System.out.println("Os produtos disponiveis em estoque são: \r\n\n" + estoque);

			System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
			System.out.println("\nGostaria de remover ou adicionar um item?\n");
			System.out.println("Digite 1 para remover e 2 para adicionar");
			opcao = ler.nextInt();

			switch (opcao) {

			case 1: {

				System.out.println("Qual o número do item que gostaria de remover?\n\n");
				System.out.println(estoque.get(0) + "\n" + estoque.get(1) + "\n" + estoque.get(2));
			}
				selecao = ler.nextInt();
				if (selecao == 1)
					estoque.remove(0);
				else if (selecao == 2)
					estoque.remove(1);
				else
					estoque.remove(2); {
				System.out.println(estoque);
				System.out.println("\nEstoque atualizado");
				System.out.println("\nDeseja sair?\nDigite 's' para sair ou digite 'n' para retornar ao inicio.");
			}
				break;

			case 2:

				System.out.println("Digite o nome do item: ");

				adicionar = ler.next();
				estoque.add(adicionar);

				System.out.println("\nItem adicionado ao estoque!");
				System.out.println(estoque);

				System.out.println("\nDeseja sair?\nDigite 's' para sair ou digite 'n' para retornar ao inicio.");
			}
			resposta = ler.next().charAt(0);

		} while (resposta != 's');

		System.out.println("Fim do programa");
	}
}