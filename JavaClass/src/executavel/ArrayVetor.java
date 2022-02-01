package executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {

	public static void main(String[] args) {
		
		String posicoes = JOptionPane.showInputDialog("Quantas posições o Array deve ter?");

		/*Array sempre deve ter a quantidade de posições definidas*/
		double[] notas = new double[Integer.parseInt(posicoes)];
		
		for(int i=0; i < notas.length; i++) {
			String valor = JOptionPane.showInputDialog("Qual o  valor da posição = " + (i+1));
			notas[i] = Double.valueOf(valor);
		}
		
		for (int i=0; i<notas.length; i++) {
			System.out.println("Nota " + (i+1) + " : " + notas[i]);
		}
		
	}
}
