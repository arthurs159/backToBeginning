package thread;

import javax.swing.JOptionPane;

public class Threads {
	public static void main(String[] args) throws InterruptedException {

		Thread threadEmail = new Thread(thread1);
		threadEmail.start();

		Thread threadFiscal = new Thread(thread2);
		threadFiscal.start();

		System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE DE THREAD");

		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");

	}

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {
			/* Código da rotina que eu quero execurar em paralelo */
			for (int i = 0; i < 10; i++) {

				System.out.println("Executando rotina, envio de e-mail");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};

	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			/* Código da rotina que eu quero execurar em paralelo */
			for (int i = 0; i < 10; i++) {

				System.out.println("Executando rotina, envio de Nota fiscal!!!");

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}

	};

}
