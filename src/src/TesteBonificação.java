package src;

public class TesteBonificação {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Marcos");
        funcionario.setCpf("467.394.498.48");
        funcionario.setSalario(1500);

        System.out.println( "Olá " + funcionario.getNome() + " Sua bonificação é de: " + funcionario.getBonificacao());

        Gerente gerente = new Gerente();
        gerente.setNome("Roberta");
        gerente.setCpf("222.222.222-22");
        gerente.setSalario(3000);
        boolean validate = gerente.validate(1234);
        System.out.println(validate);
        gerente.setCargo(1);


        System.out.println(gerente.getNome() + " Sua bonificação é de " + gerente.getBonificacao());

    }
}

