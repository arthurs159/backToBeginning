package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.classes.StatusAluno;

public class PrimeiraClasse {

	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Informe Login");
		String senha = JOptionPane.showInputDialog("Informe a Senha");

		if (login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {

			List<Aluno> alunos = new ArrayList<Aluno>();

			/* Lista contendo uma chave que identifica uma sequecia de valores */
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

//		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
//		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
//		List<Aluno> alunosReprovados = new ArrayList<Aluno>();

			for (int i = 1; i <= 5; i++) {

				String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + i + " ?");
//			String idade = JOptionPane.showInputDialog("Qual a idade?");
//		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
//		String rg = JOptionPane.showInputDialog("Registro Geral?");
//		String cpf = JOptionPane.showInputDialog("Qual � CPF?");
//		String mae = JOptionPane.showInputDialog("Nome da m�e");
//		String pai = JOptionPane.showInputDialog("Nome do pai");
//		String matricula = JOptionPane.showInputDialog("Data da matricula");
//		String serie = JOptionPane.showInputDialog("Qual a serie?");
//		String escola = JOptionPane.showInputDialog("Nome da escola");

				Aluno aluno1 = new Aluno();
				aluno1.setNome(nome);
//			aluno1.setIdade(Integer.parseInt(idade));

//		aluno1.setDataNascimento(dataNascimento);
//		aluno1.setRegistroGeral(rg);
//		aluno1.setNumeroCpf(cpf);
//		aluno1.setNomeMae(mae);
//		aluno1.setNomePai(pai);
//		aluno1.setDataMatricula(matricula);
//		aluno1.setSerieMatriculado(serie);
//		aluno1.setNomeEscola(escola);

				for (int pos = 1; pos <= 1; pos++) {
					String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + pos + " ?");
					String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina " + pos + " ?");

					Disciplina disciplina = new Disciplina();
					disciplina.setDisciplina(nomeDisciplina);
					disciplina.setNota(Double.valueOf(notaDisciplina));

					aluno1.getDisciplinas().add(disciplina);
				}

				int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");

				if (escolha == 0) {

					int continuarRemover = 0;
					int posicao = 1;

					while (continuarRemover == 0) {
						String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina 1, 2, 3 ou 4 ?");
						aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
						continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar remover ?");
					}
				}
				alunos.add(aluno1);
			}

			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

			for (Aluno aluno : alunos) {

				if (aluno.getAlunoAprovado2().equals(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				} else if (aluno.getAlunoAprovado2().equals(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				} else {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}
			}

			System.out.println(" -------------- Lista dos Aprovados ----------------- ");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println(
						"Resultado = " + aluno.getAlunoAprovado2() + " com m�dia de = " + aluno.getMediaNota());
			}

			System.out.println(" -------------- Lista dos Reprovados ----------------- ");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println(
						"Resultado = " + aluno.getAlunoAprovado2() + " com m�dia de = " + aluno.getMediaNota());
			}

			System.out.println(" -------------- Lista dos Recupera��o ----------------- ");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println(
						"Resultado = " + aluno.getAlunoAprovado2() + " com m�dia de = " + aluno.getMediaNota());
			}

		}
	}
}
