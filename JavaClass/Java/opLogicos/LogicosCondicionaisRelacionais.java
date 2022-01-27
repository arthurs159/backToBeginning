package opLogicos;

public class LogicosCondicionaisRelacionais {

	public static void main(String[] args) {
		
		int nota1 = 100;
		int nota2 = 100;
		
		if (nota1 == nota2) {
			System.out.println("As notas são iguais");
		}else {
			System.out.println("As notas são diferentes");
		}
		
		
		if (nota1 > nota2) {
			System.out.println("A nota 1 maior");
		}else {
			System.out.println("As notas são iguais");
		}
	}
}
