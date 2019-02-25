package local.edeploy.javacore.Oexception.checkedexception.test;

import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args) throws IOException {
        acessarBanco();
    }

    public static void acessarBanco() throws IOException {
        //File file = new File("teste.txt");

        try {
            System.out.println("Acessando o banco de dados...");
            System.out.println("Banco acessado com sucesso!");
        } catch (Exception e) {
            System.out.println("Falha ao acessar o banco de dados!");
            e.printStackTrace();
        } finally {
            System.out.printf("Fechando conexão");
        }
    }
}
