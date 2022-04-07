package POO;

import java.util.Scanner;

public class Objetopaciente {

	public static void main(String[] args) {
		ClassePaciente p1 = new ClassePaciente();
		Scanner ler = new Scanner(System.in);

		System.out.println("Entre com o nome do paciente: ");
		p1.nome = ler.next();
		System.out.println("A Condição do paciente é boa?");
		p1.condicao = ler.nextBoolean();

		p1.idade = 30;
		p1.endereco = "Av do Cursino,5000";

		p1.escrever();
		p1.estado();

	}

}
