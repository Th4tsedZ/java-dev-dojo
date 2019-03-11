package local.edeploy.javacore.Wio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("Arquivo.txt");
        System.out.println("Criado? " + file.createNewFile());;
        boolean exists = file.exists();
        System.out.println("Permissão de leitura? " + file.canRead());
        System.out.println("Permissão de execução? " + file.canExecute());
        System.out.println("Caminho: " + file.getAbsolutePath());
        System.out.println("É diretório? " + file.isDirectory());
        System.out.println("última modificação: " + new Date(file.lastModified()));
        if (exists){
            System.out.println("Deletado? " + file.delete());
        }
    }
}
