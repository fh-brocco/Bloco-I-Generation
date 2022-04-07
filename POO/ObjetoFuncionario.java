package POO;

import java.util.Scanner;

public class ObjetoFuncionario {

	public static void main(String[] args) {
		ClasseFuncionario Fernando = new ClasseFuncionario();
		Scanner ler = new Scanner(System.in);

		System.out.println("Entre com o código do funcionario: ");
		Fernando.codigo = ler.nextInt();

		Fernando.codigo = 1111;
		Fernando.nome = "Fernando";
		Fernando.turno = "Manha";
		Fernando.setor = "T.I";
		Fernando.funcao = "Desenvolvedor";
		Fernando.situacao = true;
		Fernando.salario = 5000.00;

		Fernando.trocarTurno();
		Fernando.turno=ler.next();
		System.out.println("Você trocou de turno!");
		
		Fernando.verificarFuncionario();
		System.out.println("\t");
		Fernando.receber(5);
		System.out.println("\t");

	}
}
