package src;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private int cargo = 0; // 0 baixo nivel -- 1 gerente -- 2 gestor


    //metodo que faz a soma de 10% do salario do funcionario3
    public double getBonificacao() {
        if(this.cargo == 0) {//baixo nível
            return this.salario * 0.1;
        }
        else if(this.cargo == 1){//gerente
            return this.salario += salario + (salario * 0.1);
        }
        else{//gestor
            return this.salario + salario * 2;
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setCargo(int cargo){
        this.cargo = cargo;
    }
}