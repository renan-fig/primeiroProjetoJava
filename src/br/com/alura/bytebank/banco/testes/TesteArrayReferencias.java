package br.com.alura.bytebank.banco.testes;

import br.com.alura.bytebank.banco.modelo.Conta;
import br.com.alura.bytebank.banco.modelo.ContaCorrente;
import br.com.alura.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {
	
	public static void main(String[] args) {
		
        //int idade[] = new int[5]; 
		Conta[] contas = new Conta[5]; //criar objeto conta para ser mais genérico
		ContaCorrente cc1 = new ContaCorrente(321, 123);
		
		contas[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(432, 234);
		contas[1] = cc2;
		
		System.out.println(contas[1].getNumero());
		
		ContaPoupanca ref = (ContaPoupanca) contas[1]; //typecast - para tranformar a referencia em algo mais especifico
		System.out.println(ref.getNumero());
		
		Object[] referencias = new Object[5]; //posso guardar qualquer tipo de referencia
		
		Object ref1 = referencias[0];
	}
}
