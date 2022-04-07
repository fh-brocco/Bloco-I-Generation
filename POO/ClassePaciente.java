
/*Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package POO;

public class ClassePaciente {

	// ATRIBUTOS

	public String nome;
	public String endereco;
	public int idade;
	public boolean condicao;

	//METODOS

	public void escrever() 
	{
		System.out.println(nome + "\n" + idade + "\n" + endereco);
	}

	public void estado() 
	{
		if (condicao == true)
			System.out.println("Paciente saudavel,liberado");
		else
			System.out.println("Paciente doente,retorne com o médico");
	}

}
