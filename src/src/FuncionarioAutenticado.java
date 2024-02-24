package src;

public  abstract class FuncionarioAutenticado extends Funcionario{

	private static int senha;

	public boolean validate(int senha) {
		if (this.senha == senha) {
			return true;
		}
		return false;
	}

	public void setSenha(int senha){
		this.senha += senha;
	}
}
