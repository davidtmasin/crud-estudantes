package com.ifce.estudante;

public class Estudante {

	private String nome;
	private int idade;
	private String matricula;
	private String CPF;
	
	public Estudante(String nome, int idade, String matricula, String CPF) {
	
		this.nome = nome;
		this.idade = idade;
		this.matricula = matricula;
		this.CPF = CPF;
		
	}
	
	public String toString() {
		return "Aluno(a): " + this.nome + "\nIdade: " + this.idade + "\nMatrícula: " + this.matricula + "\nCPF: " + this.CPF;
	}
	
	public int retornaAnoNacimento(int idade) {
		return 2021 - idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	
	
}
