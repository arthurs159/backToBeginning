package executavel;

import heran�aPolimorfismo.Aluno;
import heran�aPolimorfismo.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {

		double[] notas = { 8.8, 9.7, 7.6, 6.8 };
		double[] notasLogica = { 6.8, 8.7, 9.6, 4.8 };

		Aluno aluno = new Aluno();
		aluno.setNome("Alex Fernando");
		aluno.setNomeEscola("JDEV Treinamentos");

		// Cria��o da disciplina
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);

		aluno.getDisciplinas().add(disciplina);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("L�gica de programa��o");
		disciplina2.setNota(notasLogica);
		aluno.getDisciplinas().add(disciplina2);

		System.out.println("Nome do aluno = " + aluno.getNome() + ", Inscrito no curso : " + aluno.getNomeEscola());
		System.out.println(" ----- Disciplina do aluno ----- ");
		
		for (Disciplina disc : aluno.getDisciplinas()) {

			System.out.println("Disciplina: " + disc.getDisciplina());
			System.out.println("As notas da disciplina s�o: ");

			for (int i = 0; i < disc.getNota().length; i++) {
				System.out.println("Nota " + (i+1) + " � igual = " + disc.getNota()[i]);
			}

		}

	}
}
