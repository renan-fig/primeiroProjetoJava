package br.com.alura.bytebank.banco.modelo;

//os construtores não são herdados da classe mae
//verdadeiro nome (FQN) - modelo.ContaCorrente
public class ContaCorrente extends Conta implements Tributavel{
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override  //anotacao para o compilador
	public void saca(double valor) throws SaldoInsuficienteException{
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += + valor;		
	}
	
	@Override
	public double getValorImposto() {
		return super.saldo*0.1;
	}
	
	@Override
	public String toString() {
	    return "ContaCorrente, " + super.toString();
	}
}
