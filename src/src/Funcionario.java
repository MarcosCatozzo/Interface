package src;

//Não pode ser instaciado mais nenhum objeto novo com o tipo Funcionario, pois agora ela é uma classe abstract, e é somente herdada por suas filhas.
public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private int cargo = 0; // 0 baixo nivel -- 1 gerente -- 2 gestor


    //esse metodo agora é abstract, ou seja ele é herdado atráves das classes filhas!
    public abstract double getBonificacao();


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