package br.com.javaII.banco.conta;
/**
 *  essa class é abstract, retirei para testes...
 * @author johnnysmartins
 *
 */
public abstract class Conta {
    protected double saldo;
    protected String nome;
    
    
    public double getSaldo() {
        return this.saldo;
    }
    /**
     *  Realiza um saque
     * @param valor valor a ser depositado 
     * @throws Exception caso o saldo seja insuficente 
     */
    public void saca(double valor) throws Exception {
        if (valor < 0) {
            throw new ValorInvalidoException(valor);
        } else {
            this.saldo -= valor  - 0.10;        
        }        
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }
    
    
      public abstract void atualiza(double taxa);
    
    
    public void setSaldo(double saldo) {
    	this.saldo = saldo;
    }
    @Override
    public String toString() {
    
    	return "Conta com saldo: " + saldo;
    }
    @Override
    public boolean equals(Object obj) {
    	Conta outra = (Conta) obj;
    	return outra.saldo == this.saldo && this.nome.equals(outra.nome);
    }
}
