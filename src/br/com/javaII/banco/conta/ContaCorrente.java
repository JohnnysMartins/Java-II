package br.com.javaII.banco.conta;

public class ContaCorrente extends Conta implements Tributavel {

    private int conta;
	private String nome;
	
	public ContaCorrente(){
		
	}
	public ContaCorrente(int conta, String nome) {
    	this.conta = conta;
    	this.nome = nome;
    	
    }

	public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }

	public double calculaTributos() {
        return this.getSaldo() * 0.01;	}
}
