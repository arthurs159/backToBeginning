package switchCase;

public class Switch {
	public static void main(String[] args) {

		int nota1 = 10;
		int nota2 = 60;
		int nota3 = 100;
		int nota4 = 10;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		
		/* SWITH CASE: OPERAÇÕES EXATAS */
		
		int dia = 2;
		
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("terça-feira");
			break;
			
		default: System.out.println("Outro dia qualquer");
			break;
		}
	}
}
