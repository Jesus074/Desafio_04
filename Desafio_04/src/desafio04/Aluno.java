package desafio04;

import java.util.ArrayList;

public class Aluno {
	private String nome;
	private int idade;
	private double nota;
	
	public Aluno(String Nome, int Idade, double Nota) {
		nome = Nome; idade = Idade; nota = Nota;
	}
	
	public String getNome() {return nome;}
	public int getIdade() {return idade;}
	public double getNota() {return nota;}
	
	public void setNome(String Nome) {nome = Nome;}
	public void setIdade(int Idade) {idade = Idade;}
	public void setnota(double Nota) {nota = Nota;}

	public static void main(String[] args) {
	
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		
		alunos.add(new Aluno("Alef Lima", 22 , 9.9));

		alunos.add(new Aluno("Carlos Carneiro", 19 , 8.1));

		alunos.add(new Aluno("Jorge João", 23 , 7.5));

		double somaNotas = 0;
		String melhorAluno = null;
		double maiorNota = 0;
		
		
		
		for (Aluno aluno : alunos) {
			if(aluno.getNota() > maiorNota) {
				maiorNota = aluno.getNota();
				melhorAluno = aluno.getNome();
			}

			System.out.format("\nAluno: %s, Idade: %d, Nota: %.2f", aluno.getNome(), aluno.getIdade(), aluno.getNota());
			somaNotas += aluno.getNota();
		}
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Aluno com maior nota: " + melhorAluno);
		System.out.println("Maior nota: " + maiorNota);
        System.out.println(" ");
        System.out.println("Soma das notas: " + somaNotas);
	}

}
