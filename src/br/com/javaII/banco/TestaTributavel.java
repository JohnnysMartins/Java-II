package br.com.javaII.banco;
import br.com.javaII.banco.conta.ContaCorrente;
import br.com.javaII.banco.conta.Tributavel;
import br.com.javaII.banco.conta.ValorInvalidoException;

public class TestaTributavel {
    public static void main(String[] args) throws ValorInvalidoException {
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(100);
        System.out.println(cc.calculaTributos());
        // testando polimorfismo:
        Tributavel t = cc;
        System.out.println(t.calculaTributos());
    }
}
