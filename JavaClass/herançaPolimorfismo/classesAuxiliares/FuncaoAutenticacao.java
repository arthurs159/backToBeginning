package classesAuxiliares;

import herançaPolimorfismo.PermitirAcesso;

/*Somente receber alguem que tem o contrato da interface de permitir acesso*/
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	
	/*Construtor*/
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
	
	/*Funcao*/
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}

}
