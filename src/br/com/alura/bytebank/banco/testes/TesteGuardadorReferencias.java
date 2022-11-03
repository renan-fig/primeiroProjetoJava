package br.com.alura.bytebank.banco.testes;

import br.com.alura.bytebank.banco.modelo.Conta;
import br.com.alura.bytebank.banco.modelo.ContaCorrente;
import br.com.alura.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorReferencias {
	
	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(123, 321);
		guardador.adiciona(cc);
		
		Conta cc1 = new ContaCorrente(433, 222);
		guardador.adiciona(cc1);
		
		int tamanho = guardador.getQuantDeElemento();
		System.out.println(tamanho);
		
		Conta ref = (Conta) guardador.getReferencia(1);
		System.out.println(ref.getNumero());
	}
}
