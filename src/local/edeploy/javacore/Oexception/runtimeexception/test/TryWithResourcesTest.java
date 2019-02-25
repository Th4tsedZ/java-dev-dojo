package local.edeploy.javacore.Oexception.runtimeexception.test;

import java.io.*;

public class TryWithResourcesTest {
    public static void main(String[] args) {
        try {
            lerArquivo();
        }

    }

    public static void lerArquivo() throws IOException {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
    }
}
