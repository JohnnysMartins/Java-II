package br.com.javaII.banco.conta;

public class Cliente implements Autenticavel {
	private String nome;
	int conta;
	private String endereco;
	// ...
	
	@Override
	public boolean autentica(int senha) {
		return false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
	
		return "Cliente: " + nome;
	}
}
