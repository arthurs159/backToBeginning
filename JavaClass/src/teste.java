
public class teste {
 public static void main(String[] args) {
	
	 Pessoa pessoa = new Pessoa("Joao", "teste");
	 
	 
	 System.out.println(pessoa.getIdade());
	 
	 
	 pessoa.setIdade(15);
	 System.out.println(pessoa.getIdade());
}
}
