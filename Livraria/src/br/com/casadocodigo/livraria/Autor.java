package br.com.casadocodigo.livraria;

public class Autor {
	
	private String nome;
	private String email;
	private String CPF;
	
	public void mostrarDetalhesAutor(){
		System.out.println("***Mostrando detalhes do autor*** ");
		System.out.println("Nome do autor: "+nome);
		System.out.println("Email do autor: "+email);
		System.out.println("CPF do autor: "+CPF);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
}