package src;

public class SistemaInterno {

	private int senha = 1234;
	public void autentica(FuncionarioAutenticado g){
		boolean autenticou = g.validate(this.senha);
		if(autenticou){
			System.out.println("Pode acessar o sistema");
		}
		else {
			System.out.println("Não pode acessar o sistema");
		}
	}
}
