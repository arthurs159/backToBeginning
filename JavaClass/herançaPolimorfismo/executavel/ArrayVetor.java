package executavel;

import herançaPolimorfismo.Aluno;
import herançaPolimorfismo.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {

		double[] notas = { 8.8, 9.7, 7.6, 6.8 };
		double[] notasLogica = { 6.8, 8.7, 9.6, 4.8 };

		Aluno aluno = new Aluno();
		aluno.setNome("Alex Fernando");
		aluno.setNomeEscola("JDEV Treinamentos");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Alex Fernando 2");
		aluno2.setNomeEscola("JDEV Treinamentos");

		// Criação da disciplina
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);

		aluno.getDisciplinas().add(disciplina);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Lógica de programação");
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina2);
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Lógica de programação");
		disciplina3.setNota(notasLogica);
		
		aluno2.getDisciplinas().add(disciplina3);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Lógica de programação");
		disciplina4.setNota(notasLogica);
		
		aluno2.getDisciplinas().add(disciplina4);

		// ---------------------------------------------------- //

		Aluno[] arrayAlunos = new Aluno[2];
		
		arrayAlunos[0] = aluno;
		arrayAlunos[1] = aluno2;
		
		for (int i=0; i<arrayAlunos.length; i++) {
			
			System.out.println("Nome do aluno é: " + arrayAlunos[i].getNome());
			
			for(Disciplina d : arrayAlunos[i].getDisciplinas()) {
				System.out.println("Nome da disciplina é: " + d.getDisciplina());
				
				for(int j=0; j<d.getNota().length; j++) {
					System.out.println("A nota número: " + (j+1) + " é igual = " + d.getNota()[j]);
				}
			}
			
			
			
		}
		
	}
}
