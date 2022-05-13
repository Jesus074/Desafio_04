import java.util.List;
import java.util.ArrayList;

public class Alunos {
	
	public class Onix {
	    public static class Aluno {
	        private String nome;
	        private int idade;
	        public double nota;

	        public Aluno(String nome, int idade, double nota) {
	            this.nome = nome;
	            this.idade = idade;
	            this.nota = nota;
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

	        public double getNota() {
	            return nota;
	        }

	        public void setNota(double nota) {
	            this.nota = nota;
	        }  
	    }
	    public static void main(String[] args) {
	        List<Aluno> listAluno = new ArrayList<Aluno>();
	        
	        listAluno.add(new Aluno("Alef Lima ", 22 , 9.9));
	        listAluno.add(new Aluno("Carlos Araujo ", 19 , 6.1));
	        listAluno.add(new Aluno("Geisa Jesus ", 25 , 5.5));

	        int somaNotas = 0;
	        String maiorAluno = null;

	        double maiorNota = 0;
	        for (Aluno aluno : listAluno){
	            if(aluno.getNota() > maiorNota){
	            maiorNota = aluno.getNota();
	            maiorAluno = aluno.getNome();
	        }
	        somaNotas += aluno.getNota();
	    }
	        System.out.println("Maior nota: " + maiorNota);
	        System.out.println("Aluno com maior nota: " + maiorAluno);
	        System.out.println("Soma das notas: " + somaNotas);

	    }
	}

}
