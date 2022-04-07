
/*Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/

package POO;

public class ClasseProdutoEletronico {
	
	//ATRIBUTOS
	public String aparelho;
	public String modelo;
	public long ano; 
	public 	boolean condicao;


	//METODOS
		public void escrever() 
		{
			System.out.println(aparelho + "\n" + modelo + "\n" + ano);
		}
		public void estado() {
			if (condicao == true)
				System.out.println("Aparelho novo");
			else
				System.out.println("Aparelho usado");
		}

}
