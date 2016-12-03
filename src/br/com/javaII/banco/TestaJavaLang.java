package br.com.javaII.banco;


public class TestaJavaLang {

	public static void main(String[] args) {
		String curso = "curso";
		curso = curso.replace("c", "b");
		curso = curso.toUpperCase();
		
		System.out.println(curso);
		System.out.println("Meu nome nao é johnny");
		System.out.println(curso.length());
		
//		Conta c1 = new Conta(500.0);
//		Conta c2 = new Conta(500.0);
//		Cliente joao = new Cliente();
//		joao.setNome("joao");
//		
//		GuardadorDeObjetos armario = new GuardadorDeObjetos();
//		armario.adcionar(c1);
//		armario.adcionar(c2);
//		
//		armario.adcionar(joao);
//		
//		/*Conta teste = (Conta) armario.pega(0);
//		Cliente cliente = (Cliente) armario.pega(2);*/
//		
//		System.out.println(c1);
//		
//		System.out.println(joao);
//		
//		if (c1.equals(c2)) {
//			System.out.println("As contas sao iguais !");
//		} else {
//			System.out.println("As contas sao diferentes !");
//		}

	}

}
