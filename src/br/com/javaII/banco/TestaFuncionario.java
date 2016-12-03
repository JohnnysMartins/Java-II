package br.com.javaII.banco;
import br.com.javaII.banco.conta.Funcionario;
import br.com.javaII.banco.conta.Gerente;
import br.com.javaII.banco.conta.TotalizadorDeBonus;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario joao = new Gerente();
		joao.setSalario(1000.0);
	
		System.out.println(joao.getBonus());
	
		Gerente joaquim = new Gerente();
		joaquim.setSalario(2000.0);
		
		System.out.println(joaquim.getBonus());
		
		TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
		totalizador.adiciona(joao);
		totalizador.adiciona(joaquim);
		
		System.out.println(totalizador.getTotal());
	
	}
	
}
