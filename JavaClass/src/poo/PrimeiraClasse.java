package poo;

public class PrimeiraClasse {

	public static void main(String[] args) {
		
		/*Objeto ainda n�o existe na memoria*/
//		Aluno aluno1;
		
//		/*Agora temos um objeto real na memoria*/
//		Aluno aluno2 = new Aluno();
		
		Aluno aluno1 = new Aluno(); /*Aqui ser� Joao*/
		
		Aluno aluno2 = new Aluno(); /*Aqui ser� Pedro*/
		
		Aluno aluno3 = new Aluno(); /*Aqui ser� Alex*/
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("Jos�", 50);
	}
}
