package local.edeploy.javacore.Oexception.checkedexception.test;

import local.edeploy.javacore.Oexception.checkedexception.classes.Leitor1;
import local.edeploy.javacore.Oexception.checkedexception.classes.Leitor2;

import java.io.*;

public class TryWithResourcesTest {
    public static void main(String[] args) {
    }

    public static void lerArquivo() throws IOException {

        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (Reader reader = new BufferedReader(new FileReader("test.txt"))) {
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
