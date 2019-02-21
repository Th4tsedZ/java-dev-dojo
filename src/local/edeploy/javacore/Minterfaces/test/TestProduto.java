package local.edeploy.javacore.Minterfaces.test;

import local.edeploy.javacore.Minterfaces.classes.Produto;

public class TestProduto {
    public static void main(String[] args) {
        Produto p = new Produto("Notebook", 3.20, 1800);

        p.calcularImposto();
        p.calculaFrete();
        System.out.println(p);
    }
}
