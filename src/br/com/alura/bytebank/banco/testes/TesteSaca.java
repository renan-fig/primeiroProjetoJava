package br.com.alura.bytebank.banco.testes;
import br.com.alura.bytebank.banco.modelo.*;

public class TesteSaca {
	public static void main(String[] args) {
		//Full Qualified Name FQN
		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(200.00);
		
		try {
			conta.saca(290.0);
		}catch(SaldoInsuficienteException ex) {
			System.out.println("Ex:" + ex.getMessage());
		}
		
		
		System.out.println(conta.getSaldo());
	}
}
