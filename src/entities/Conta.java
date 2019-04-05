package entities;

public class Conta {
	
	private String nome;
	private int conta;
	private double saldo;
	
	public Conta() {
		
	}

	public Conta (String nome, int conta, double depositoInicial) {
		this.nome = nome;
		this.conta = conta;
		Deposito(depositoInicial);
	}
	
	public Conta (String nome, int conta) {
		this.nome = nome;
		this.conta = conta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getConta() {
		return conta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void Saque(double valor) {
		saldo = saldo - (valor + 5.00);
	}
	
	public void Deposito(double valor) {
		saldo = saldo + valor;
	}
	
	public String toString() {
		return "Conta: " + conta + ", Nome: " + nome + ", Saldo: $" + String.format("%.2f ", saldo); 
	}
}
