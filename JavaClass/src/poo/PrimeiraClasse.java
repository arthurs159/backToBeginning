package poo;

public class PrimeiraClasse {

	public static void main(String[] args) {

		/*aluno1 � uma referencia para o objeto aluno*/
		Aluno aluno1 = new Aluno(); /*Aqui ser� Joao*/
		aluno1.setNome("Jo�o");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("18/10/1987");
		aluno1.setRegistroGeral("454.4545.4554");
		aluno1.setNumeroCpf("1569.45454.32326");
		aluno1.setNomeMae("Shirley");
		aluno1.setNomePai("Antonio");
		aluno1.setDataMatricula("10/10/2020");
		
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);
		
		System.out.println("Nome � = " + aluno1.getNome());
		System.out.println("Idade � = " + aluno1.getIdade());
		System.out.println("Nascimento = " + aluno1.getDataNascimento());
		System.out.println("M�dia da nota � = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2 = " + aluno1.getAlunoAprovado2());
		
		Aluno aluno2 = new Aluno(); /*Aqui ser� Pedro*/
		
		Aluno aluno3 = new Aluno(); /*Aqui ser� Alex*/
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("Jos�", 50);
	}
}
