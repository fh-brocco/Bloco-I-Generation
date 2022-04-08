package cineGenFlix;

public class DonoEmpresa extends Pessoa {

	public String produto;

	public DonoEmpresa(String produto, String nome, String email, long telefone, int idade) {
		this.produto = produto;
	}

	public void status() {
		System.out.println("Produto: " + this.produto);

	}
        
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

}
