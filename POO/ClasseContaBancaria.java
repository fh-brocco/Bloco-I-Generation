
/*Crie uma classe conta bancaria e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto conta bancaria, defina as instancias deste objeto e apresente 
 * as informações deste objeto no console.*/

package POO;

public class ClasseContaBancaria {

	public int cod;
	public String nome;
	public double saldo;
	public double resto;

	public void debito(double valorDebito) 
	{
		
		if (valorDebito < saldo)
			System.out.println("Seu saldo total é :"+resto+" R$");
 		
		else if(valorDebito > saldo)
			System.out.println("Valor indisponivel para saque!");
		    else
		    {
		    	resto = saldo - valorDebito;
				System.out.println();
			}
	}

	public void verificaUsuario() {
		System.out.printf("Codigo: %d \nNome: %s \nSaldo: %.2f", cod, nome, saldo);
	}

}
