package src;

public class Cliente implements Autenticado {

	private int senha;
	@Override
	public boolean validate(int senha) {
		if(this.senha == senha){
			System.out.println(" Acesso permitido ");
			return true;
		}else {
			System.out.println(" Acesso negado ");
		}
		return false;
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}
}
