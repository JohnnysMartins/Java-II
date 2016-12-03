package br.com.javaII.banco;

import br.com.javaII.banco.conta.Conta;

public class GuardadorDeObjetos {

	private Object[] contas;
	private int posicaoLivre;
	
	public GuardadorDeObjetos(){
		contas = new Object[100];
		posicaoLivre = 0;
	}
	
	public void adcionar(Object nova){
		contas[posicaoLivre] = nova;
		posicaoLivre++;
	}
	public Object pega(int posicao){
		return contas[posicao];
	}
}
