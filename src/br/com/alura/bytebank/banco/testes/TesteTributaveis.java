package br.com.alura.bytebank.banco.testes;
import br.com.alura.bytebank.banco.modelo.*;

public class TesteTributaveis {

	public static void main(String[] args) {
		//Full Qualified Name FQN
		ContaCorrente cc = new ContaCorrente(222,333);
		cc.deposita(100);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorImposto calc = new CalculadorImposto();
		calc.registro(cc);
		calc.registro(seguro);
		
		System.out.println(calc.getTotalImposto());
		System.out.println(calc.getTotalImposto());

	}

}
