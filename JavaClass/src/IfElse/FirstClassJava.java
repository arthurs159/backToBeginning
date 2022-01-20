package IfElse;

public class FirstClassJava {

	public static void main(String[] args) {

		int nota1 = 10;
		int nota2 = 60;
		int nota3 = 100;
		int nota4 = 10;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		/* Condições lógica com IF e ELSE */

//		if (media >= 70) {
//			System.out.println("Aluno aprovado: " + media );
//		}else if (media >=40 && media <= 69) {
//			System.out.println("Aluno em recuperação: " + media);
//		}else {
//			System.out.println("Aluno Reprovado: " + media);
//		}

		/* Operadores ternários são para micro validações */

//		String saidaResultado = media >= 70 ? "Aluno Aprovado" : "Aluno Reprovado";
//		String saidaResultado = media >= 70 ? "Aluno Aprovado" : (media >=40 && media <=69) ? "Aluno em recuperação" : "Aluno Reprovado";
//		System.out.println(saidaResultado);

		/* Operações lógicas aninhadas: São pareções dentor de operações */

		if (media >= 50) {
			if (media >= 70) {
				if (media > 90) {
					System.out.println("O aluno está aprovado direto!! - Parabéns!!!");
				} else {
					System.out.println("Aluno está em recuperação");
				}
			} else {
				System.out.println("Aluno em recuperação");
			}
		} else {
			System.out.println("Aluno reprovado direto!!");
		}
	}
}
