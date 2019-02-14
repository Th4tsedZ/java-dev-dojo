package local.edeploy.javacore.Eblocodeinicialização.test;

import local.edeploy.javacore.Eblocodeinicialização.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        System.out.println("Quantidade de parcelas possíveis: ");
        for (int parcela : c.getParcelas()){
            System.out.print(parcela + " ");
        }
    }
}
