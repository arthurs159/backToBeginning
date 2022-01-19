
public class Pessoa {

	private String name;

	private String sobrenome;

	private int idade;

	public Pessoa() {
	}

	public Pessoa(String name, String sobrenome, int idade) {
		this.name = name;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
