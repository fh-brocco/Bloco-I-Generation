
/*Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package POO;

public class ClasseCliente {

	//ATRIBUTOS
	public String nome;
	public String endereco;
	public String email;
	public long codigo; 
	public long celular;
	public short idade;
	public boolean condicao;


	//METODOS
	public void escrever() {
		System.out.println(nome + "\n" + endereco + "\n" + email + "\n" + codigo + "\n" + celular + "\n" + idade);
	}

	public void estado() {
		if (condicao == true)
			System.out.println("Cliente Ativo");
		else
			System.out.println("O cliente inativo");
	}
}
