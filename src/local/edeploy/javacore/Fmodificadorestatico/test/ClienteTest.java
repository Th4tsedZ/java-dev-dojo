package local.edeploy.javacore.Fmodificadorestatico.test;


import local.edeploy.javacore.Fmodificadorestatico.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();
        System.out.println("Quantidade de parcelas possíveis: ");
        for (int parcela : c1.getParcelas()){
            System.out.print(parcela + " ");
        }
    }
}
