
/*Crie uma classe funcionário e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto funcionário, defina as instancias deste objeto e apresente 
 * as informações deste objeto no console*/

package POO;

public class ClasseFuncionario {

	public int codigo;
	public String nome;
	public String turno;
	public double salario;
	public String setor;
	public String funcao;
	public boolean situacao;

	public void trocarTurno() {
		if (turno == "Manha") {
			System.out.println("Escolha o turno para troca: Tarde ou Noite"+"\n");
		} else if (turno == "Tarde") {
			System.out.println("Escolha o turno para troca: Manha ou Noite"+"\n");
		} else {
			System.out.println("Escolha o turno para troca: Manha ou Tarde"+"\n");
		}
	}

	public void receber(int diaAtual) {
		if (diaAtual == 5) {
			System.out.println("Dia de receber salario");
		} else {
			System.out.println("Ainda não é o dia de receber o salario!");
		}
	}

	public void verificarFuncionario() {
		System.out.printf("Codigo de funcionario: %d \nNome: %s \nSetor: %s \nTurno: %s \nFunção: %s \nSalario: R$%.2f",
				codigo, nome, setor, turno, funcao, salario);
	}
}
