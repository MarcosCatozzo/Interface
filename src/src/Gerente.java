package src;

public class Gerente extends Funcionario {

    private static int senha = 1234;

    public boolean validate(int senha) {
        if (this.senha == senha) {
            return true;
        }
        return false;
    }
//    public double getBonificacao(){
        //A PALAVRA CHAVE "SUPER" INDICA QUE ESTAMOS INVOCANDO UM ATRIBUTO DA CLASS MÃE
//        return super.getBonificacao();

//    }
//     public void setSenha(int senha){
//        this.senha = senha;
//     }
}
