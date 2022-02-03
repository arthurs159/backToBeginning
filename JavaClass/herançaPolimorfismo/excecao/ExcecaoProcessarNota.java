package excecao;

public class ExcecaoProcessarNota extends Exception{

	private static final long serialVersionUID = 1L;

	public ExcecaoProcessarNota(String erro) {
		super("Um erro no processamento " + erro);
	}
	
}
