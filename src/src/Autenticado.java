package src;
// contrato Autenticavél
// quem assina o contrato precisa implementar
//metodo setSenha
// metodo autentica


public  abstract interface Autenticado {

	public abstract boolean validate(int senha);
	public abstract void setSenha(int senha);
}
