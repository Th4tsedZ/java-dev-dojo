package local.edeploy.javacore.Wio.test;

import java.io.*;

public class BufferedTest {
    public static void main(String[] args) {

        File file = new File("Arquivo.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));
             BufferedReader br = new BufferedReader(new FileReader(file))){

            bw.write("Escrevendo no arquivo através de BufferedWriter");
            bw.newLine();
            bw.write("E pulando uma linha 3");
            bw.flush();
            bw.close();

            String s = null;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
