package br.com.alura.bytebank.banco.testes.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {
	
	public static void main(String[] args) {
		Integer idadeRef = Integer.valueOf(29); 
		System.out.println(idadeRef.intValue());
		
		Double dRef = Double.valueOf(3.2);
		System.out.println(dRef.doubleValue());
		
		Boolean bRef = Boolean.TRUE;
		System.out.println(bRef.booleanValue());
		
		Number refNumero = Integer.valueOf(34);
		
		List<Number> lista = new ArrayList<>();
		lista.add(refNumero);
		lista.add(idadeRef);
	}

	
}
