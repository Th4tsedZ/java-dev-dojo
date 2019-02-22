package local.edeploy.javacore.Oexception.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args) throws IOException {
        criarArquivo();
    }

    public static void criarArquivo() throws IOException {
        File file = new File("teste.txt");

        try {
            System.out.println("Arquivo criado? " + file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
