package br.com.alura.bytebank.banco.testes;
import br.com.alura.bytebank.banco.modelo.*;

//br.com.alura.bytebank.banco.testes.TesteContas
public class TesteContas {
	
	public static void main(String[] args) {
		//Full Qualified Name FQN
		ContaCorrente contac = new ContaCorrente(1234, 3344);
		contac.deposita(100.0);
		
		ContaPoupanca contap = new ContaPoupanca(5678, 1122);
		contap.deposita(200.0);
		
		try {
			contac.transfere(50, contap);
		}catch(SaldoInsuficienteException ex) {}
		
		System.out.println("Conta corrente:"+contac.getSaldo());
		System.out.println("Conta poupança:"+contap.getSaldo());
	}
}
