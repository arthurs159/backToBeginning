package IfElse;

public class FirstClassJava {

	public static void main(String[] args) {
		
		int nota1 = 10;
		int nota2 = 60;
		int nota3 = 30;
		int nota4 = 40;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		/* Condi��es l�gica com IF e ELSE */
		
		if (media >= 70) {
			System.out.println("Aluno aprovado: " + media );
		}else if (media >=40 && media <= 69) {
			System.out.println("Aluno em recupera��o: " + media);
		}else {
			System.out.println("Aluno Reprovado: " + media);
		}
		
		/* Operadores tern�rios s�o para micro valida��es */
		
//		String saidaResultado = media >= 70 ? "Aluno Aprovado" : "Aluno Reprovado";
		String saidaResultado = media >= 70 ? "Aluno Aprovado" : (media >=40 && media <=69) ? "Aluno em recupera��o" : "Aluno Reprovado";
		System.out.println(saidaResultado);
		
		
	}
}
