package com.ifce.estudante;

public class Estudante {
	private Long id;
	private String nome;
	private int idade;
	private String matricula;
	private String CPF;
	
	public Estudante(){}
	
	public Estudante(Long id, String nome, int idade, String matricula, String CPF) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.matricula = matricula;
		this.CPF = CPF;
		
	}
	
	public String toString() {
		return "Aluno(a): " + this.nome + "\nIdade: " + this.idade + "\nMatrícula: " + this.matricula + "\nCPF: " + this.CPF + "\n";
	}
	
	public int retornaAnoNacimento(int idade) {
		return 2021 - idade;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	
	
	
}
