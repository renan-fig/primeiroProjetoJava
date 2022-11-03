package br.com.alura.bytebank.banco.testes;

import br.com.alura.bytebank.banco.modelo.ContaCorrente;
import br.com.alura.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayPrimitivo {
	
	//Array[]
    public static void main(String[] args) {

        int idade[] = new int[5]; 
        int[] refs = {1,2,3,4,5}; //forma literal
        
        idade[0] = 29;
        idade[1] = 37;
        idade[2] = 43;
        idade[3] = 51;
        idade[4] = 68;
        
        
        int idade1 = idade[0]; 
        
        System.out.println(idade.length);
        
        for(int i=0;i<idade.length;i++) {
        	System.out.println(idade[i]);
        }
    }
}