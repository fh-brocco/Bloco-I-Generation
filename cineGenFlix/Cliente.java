package cineGenFlix;

public class Cliente extends Pessoa {

	public double saldo;

	public Cliente(double saldo, String nome, String email, long telefone, int idade) {
		this.saldo = saldo;
		this.setNome(nome);
		this.setEmail(email);
		this.setTelefone(telefone);
		this.setIdade(idade);
	}

	public void status() {
		System.out.println("Nome do cliente: " + this.getNome());
		System.out.println("Email: " + this.getEmail());
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
