package IfElse;

public class FirstClassJava {

	public static void main(String[] args) {
		
		int nota1 = 10;
		int nota2 = 60;
		int nota3 = 30;
		int nota4 = 40;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media >= 70) {
			System.out.println("Aluno aprovado: " + media );
		}else if (media >=40 && media <= 69) {
			System.out.println("Aluno em recuperação: " + media);
		}else {
			System.out.println("Aluno Reprovado: " + media);
		}
	}
}
