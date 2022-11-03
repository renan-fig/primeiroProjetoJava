package br.com.alura.bytebank.banco.testes.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
	
	public static void main(String[] args) {
		
		int[] idades = new int[5];
		String[] nomes = new String[5];
		
		int idade = 29;
		Integer idadeRef = new Integer(29); //não é indicado
		Integer idade2 = Integer.valueOf(34); //boxing
		int valor = idade2.intValue();  //unboxing
		
		String s = args[0];
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		
		
		
		
		List<Integer> numeros = new ArrayList<Integer>(); //SÓ guardar referencias
		numeros.add(idade);  //autoboxing
		
		
	}
}
