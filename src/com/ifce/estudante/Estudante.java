package com.ifce.estudante;

public class Estudante {

	String nome;
	int idade;
	String matricula;
	String CPF;
	
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
	
}
