package br.com.alura.bytebank.banco.testes.util;

import java.util.ArrayList;
import java.util.LinkedList;

import br.com.alura.bytebank.banco.modelo.Conta;
import br.com.alura.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		
		LinkedList<Conta> lista = new LinkedList<Conta>(); 
		
		
//		Conta cc = new ContaCorrente(11, 22);
//		lista.add(cc);
//		Conta cc1 = new ContaCorrente(22, 33);
//		lista.add(cc1);
//		
//		boolean igual = cc.ehIgual(cc1);
//		System.out.println(igual);
		
		Conta cc = new ContaCorrente(11, 22);
		lista.add(cc);
		
		Conta cc1 = new ContaCorrente(11, 22);
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente(11, 22);
		boolean existe = lista.contains(cc2);
		
		System.out.println("Já existe? " + existe);
		
		
		for(int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
	}
}
