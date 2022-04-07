

/*Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package POO;

public class ObjetoCliente {

	public static void main(String[] args) {
		ClasseCliente x1= new ClasseCliente();
		
		x1.nome= "Fernando Brocco";
		x1.endereco="Av. do Cursino,12000";
		x1.email="fernando@eclipse.com";
		x1.codigo=123456; 
		x1.celular=922221111;
		x1.idade=30;
		x1.condicao=true;
          
		x1.estado();
		x1.escrever();
		
	}
	    
}
