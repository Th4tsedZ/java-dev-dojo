package local.edeploy.javacore.Lclassesabstratas.test;

import local.edeploy.javacore.Lclassesabstratas.classes.Gerente;
import local.edeploy.javacore.Lclassesabstratas.classes.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Ana", "22565-07", 3000);
        Vendedor v = new Vendedor("Joao", "55246-52", 1500, 5000);

        System.out.println(g);
        System.out.println(g.calculaSalario());
        System.out.println("");
        System.out.println(v);
        System.out.println(v.calculaSalario());
    }
}
