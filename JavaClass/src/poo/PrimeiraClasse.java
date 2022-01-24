package poo;

public class PrimeiraClasse {

	public static void main(String[] args) {
		
		/*Objeto ainda não existe na memoria*/
//		Aluno aluno1;
		
//		/*Agora temos um objeto real na memoria*/
//		Aluno aluno2 = new Aluno();
		
		Aluno aluno1 = new Aluno(); /*Aqui será Joao*/
		
		Aluno aluno2 = new Aluno(); /*Aqui será Pedro*/
		
		Aluno aluno3 = new Aluno(); /*Aqui será Alex*/
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("José", 50);
	}
}
