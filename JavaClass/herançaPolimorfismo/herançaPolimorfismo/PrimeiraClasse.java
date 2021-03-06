package herançaPolimorfismo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import classesAuxiliares.FuncaoAutenticacao;
import excecao.ExcecaoProcessarNota;

public class PrimeiraClasse {

	public static void main(String[] args) {

		try {

//			File fill = new File("lines.txt");
//			Scanner scanner = new Scanner(fill);

//			lerArquivo();

			String login = JOptionPane.showInputDialog("Informe Login");
			String senha = JOptionPane.showInputDialog("Informe a Senha");

			if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) {

				List<Aluno> alunos = new ArrayList<Aluno>();

				/* Lista contendo uma chave que identifica uma sequecia de valores */
				HashMap<String, List<Aluno>> maps = new HashMap<>();

				for (int i = 1; i <= 2; i++) {

					String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + i + " ?");

					Aluno aluno1 = new Aluno();
					aluno1.setNome(nome);

					for (int pos = 1; pos <= 1; pos++) {
						String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + pos + " ?");
						String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina " + pos + " ?");

						Disciplina disciplina = new Disciplina();
						disciplina.setDisciplina(nomeDisciplina);
//						disciplina.setNota(Double.valueOf(notaDisciplina));

						aluno1.getDisciplinas().add(disciplina);
					}
//
//				int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
//
////				if (escolha == 0) {
//
//					int continuarRemover = 0;
//					int posicao = 1;
//
//					while (continuarRemover == 0) {
//						String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina 1, 2, 3 ou 4 ?");
//						aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
//						continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar remover ?");
//					}
//				}
					alunos.add(aluno1);

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
				}

				System.out.println(" -------------- Lista dos Aprovados ----------------- ");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println("Resultado = Aluno de nome: " + aluno.getNome() + " Foi "
							+ aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
				}

				System.out.println(" -------------- Lista dos Reprovados ----------------- ");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println("Resultado = Aluno de nome: " + aluno.getNome() + " Foi "
							+ aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
				}

				System.out.println(" -------------- Lista dos Recuperaç?o ----------------- ");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println("Resultado = Aluno de nome: " + aluno.getNome() + " Foi "
							+ aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
				}
			} else {
				JOptionPane.showMessageDialog(null, "Acesso negado");
			}

		} catch (NumberFormatException e) {

			StringBuilder saida = new StringBuilder();

			System.out.println("Mensagem : " + e.getMessage());

			for (int i = 0; i < e.getStackTrace().length; i++) {
				saida.append(" \n Classe de erro : " + e.getStackTrace()[i].getClassName());
				saida.append(" \n Classe de erro : " + e.getStackTrace()[i].getMethodName());
				saida.append(" \n Classe de erro : " + e.getStackTrace()[i].getLineNumber());
			}

			JOptionPane.showMessageDialog(null, "Erro ao processar notas" + saida.toString());
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Um nullpointer exception : " + e.getClass());
		} finally {
			JOptionPane.showMessageDialog(null, "Obrigado por aprender java comigo");
		}
	}

	public static void lerArquivo() throws ExcecaoProcessarNota {

		try {
			File fill = new File("lines.txt");
			Scanner scanner = new Scanner(fill);
		} catch (FileNotFoundException e) {
			throw new ExcecaoProcessarNota(e.getMessage());
		}

	}

}
