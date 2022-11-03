package br.com.alura.bytebank.banco.modelo;

/**
 * Classe que representa a Cliente no Bytebank
 * 
 * 
 * @author Renan Figueiredo
 * @version 0.1
 */

//verdadeiro nome (FQN) - modelo.Cliente
public class Cliente {
	private String nome;
	private String cpf;
	private String profissao;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}
