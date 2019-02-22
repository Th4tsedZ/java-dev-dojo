package local.edeploy.javacore.Npolimorfismo.test;

import local.edeploy.javacore.Npolimorfismo.classes.Gerente;
import local.edeploy.javacore.Npolimorfismo.classes.RelatorioPagamento;
import local.edeploy.javacore.Npolimorfismo.classes.Vendedor;

public class PolimorfismoTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Celso", 5000, 500);
        Vendedor v = new Vendedor("Bruna", 2000, 5000);

        RelatorioPagamento relatorios = new RelatorioPagamento();

        relatorios.relatorioPagamentoGenerico(v);
        System.out.println("----------------------------------------");
        relatorios.relatorioPagamentoGenerico(g);
    }
}
