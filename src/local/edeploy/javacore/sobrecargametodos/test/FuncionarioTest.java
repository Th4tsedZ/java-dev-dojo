package local.edeploy.javacore.sobrecargametodos.test;

import local.edeploy.javacore.sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João","123.456.789-01", 2300);
        Funcionario funcionario2 = new Funcionario("Bruna","321.654.987-12", 5200, "321.654.987-22");

        funcionario1.print();
        funcionario2.print();
    }
}
