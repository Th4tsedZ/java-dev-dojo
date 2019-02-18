package local.edeploy.javacore.Hherança.test;

import local.edeploy.javacore.Hherança.classes.Endereco;
import local.edeploy.javacore.Hherança.classes.Funcionario;
import local.edeploy.javacore.Hherança.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Endereco endereco1 = new Endereco();
        Funcionario funcionario1 = new Funcionario();

        pessoa1.setNome("Gina");
        pessoa1.setCpf("123456");

        funcionario1.setNome("Augusto");
        funcionario1.setCpf("321654");
        funcionario1.setSalario(3200);

        endereco1.setBairro("Jardim azul");
        endereco1.setRua("Rua vermelha");

        pessoa1.setEndereco(endereco1);
        funcionario1.setEndereco(endereco1);

        pessoa1.print();
        System.out.println("---------------------------------");
        funcionario1.print();
    }
}
