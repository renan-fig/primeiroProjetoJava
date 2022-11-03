package br.com.alura.bytebank.banco.testes.util;

import java.util.ArrayList;

import br.com.alura.bytebank.banco.modelo.Conta;
import br.com.alura.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		//Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();  // <objeto> -> serve para restringir o tipo de referencia de uma lista (deixa o codigo masi seguro)
		
		Conta cc = new ContaCorrente(123, 321);
		lista.add(cc);
		
		Conta cc1 = new ContaCorrente(433, 222);
		lista.add(cc1);
		
		System.out.println("Tamanho: "+lista.size());
		
		Object ref = (Conta) lista.get(0);
		System.out.println(ref);
		
		Conta cc3 = new ContaCorrente(444, 333);
		lista.add(cc3);
		Conta cc4 = new ContaCorrente(412, 444);
		lista.add(cc4);
		
		lista.remove(1);
		System.out.println("Tamanho: "+lista.size());
		
		for(int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("--------------------");
		
		//Forma mais simplificada
		for(Object refConta : lista) {
			System.out.println(refConta);
		}
	}
}
