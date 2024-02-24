package src;

import java.lang.reflect.GenericArrayType;

public class TesteFuncionario {

	public static void main(String[] args) {

		Gerente marcos = new Gerente();
		marcos.setNome("Marcos");
		marcos.setCpf("222.222.222.22");
		marcos.setSalario(5000.0);
		marcos.setCargo(1);

		System.out.println(marcos.getNome());
		System.out.println(marcos.getBonificacao());
	}
}
