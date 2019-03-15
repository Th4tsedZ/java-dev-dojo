package local.edeploy.javacore.Wio.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTest {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");

        try {
            FileWriter fw = new FileWriter(file);
            FileReader fr = new FileReader(file);
            fw.write("Escrevendo uma mensagem no arquivo\nE pulando uma linha");
            fw.flush();

            char[] in = new char[500];
            int size = fr.read(in);
            System.out.println("Número de caracteres lidos: " + size);

            for (char carac : in) {
                System.out.print(carac);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try {
//
//            char[] in = new char[500];
//            int size = fr.read(in);
//            System.out.println("Número de caracteres lidos: " + size);
//
//            for (char carac : in){
//                System.out.print(carac);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
