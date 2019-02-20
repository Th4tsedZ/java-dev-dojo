package local.edeploy.javacore.Kunum.test;

import local.edeploy.javacore.Kunum.classes.Cliente;
import local.edeploy.javacore.Kunum.classes.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente("Anna", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.AVISTA);

        System.out.println(c);
    }
}