package br.com.javaII.banco;

import java.io.PrintStream;

import br.com.javaII.banco.conta.Conta;
import br.com.javaII.banco.conta.ContaCorrente;

public class TestaInteger {

	public static void main(String[] args) {
		ImprimirInversoCorreto("Socorram-me, subi no ônibus em Marrocos");
	}
	
	public static void ImprimirLetra(String palavra){
		for (int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}
	}
	public static void ImprimirInverso(String palavra){
		for (int i = palavra.length() - 1;i >= 0; i--) {
			System.out.print(palavra.charAt(i));
		}
	}
	public static void ImprimirInversoCorreto(String texto){
		String[] palavras = texto.split(" ");
		for (int i = palavras.length - 1;i >= 0; i--) {
			System.out.print(palavras[i] + 	" ");
		}
	}
}
