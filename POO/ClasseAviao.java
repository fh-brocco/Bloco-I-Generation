
/*Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package POO;

public class ClasseAviao {
	
	//ATRIBUTOS
	public String companhia;
	public boolean manutencao;
	public boolean tipo;
	public boolean condicao;

	//METODOS
		public void escrever() 
		{
			System.out.println(companhia + "\n" +manutencao+ "\n" + tipo);
		}
		public void modelo() {
			if (tipo == false)
				System.out.println("Avião de passageiros");
			else
				System.out.println("Avião de carga");
		}
		public void manut() {
			if (manutencao == true)
				System.out.println("Manutenção em dia");
			else
				System.out.println("Encaminhar avião para reparos");
		}
		public void estado() {
			if (condicao == true)
				System.out.println("Avião Ativo");
			else
				System.out.println("Avião fora de serviço");
		}

}
