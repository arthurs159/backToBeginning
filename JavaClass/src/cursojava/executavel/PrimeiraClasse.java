package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasse {

	public static void main(String[] args) {

		/* aluno1 é uma referencia para o objeto aluno */

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno ?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
//		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
//		String rg = JOptionPane.showInputDialog("Registro Geral?");
//		String cpf = JOptionPane.showInputDialog("Qual é CPF?");
//		String mae = JOptionPane.showInputDialog("Nome da mãe");
//		String pai = JOptionPane.showInputDialog("Nome do pai");
//		String matricula = JOptionPane.showInputDialog("Data da matricula");
//		String serie = JOptionPane.showInputDialog("Qual a serie?");
//		String escola = JOptionPane.showInputDialog("Nome da escola");

		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.parseInt(idade));

//		aluno1.setDataNascimento(dataNascimento);
//		aluno1.setRegistroGeral(rg);
//		aluno1.setNumeroCpf(cpf);
//		aluno1.setNomeMae(mae);
//		aluno1.setNomePai(pai);
//		aluno1.setDataMatricula(matricula);
//		aluno1.setSerieMatriculado(serie);
//		aluno1.setNomeEscola(escola);

		for (int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + pos + " ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina " + pos + " ?");

			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}

		System.out.println(aluno1);
		System.out.println("Média do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());

	}
}
