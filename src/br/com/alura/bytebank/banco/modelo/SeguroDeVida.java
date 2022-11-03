package br.com.alura.bytebank.banco.modelo;

//verdadeiro nome (FQN) - modelo.SeguroDeVida
public class SeguroDeVida implements Tributavel{
	
	@Override
	public double getValorImposto() {
		return 42;
	}
	
}
