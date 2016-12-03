package br.com.javaII.banco;
import br.com.javaII.banco.conta.Conta;
import br.com.javaII.banco.conta.ContaPoupanca;


public class TestaDeposita {
    public static void main(String[] args) {
        Conta cp = new ContaPoupanca();
        try {
            cp.deposita(100);
            System.out.println(cp.getSaldo());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
