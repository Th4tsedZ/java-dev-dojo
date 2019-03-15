package local.edeploy.javacore.Wio.test;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTest {
    public static void main(String[] args) throws IOException {
        File diretorio = new File("folder");
        boolean mkdir = diretorio.mkdir();
        System.out.println("Diretório criado? " + mkdir);

        File arquivo = new File(diretorio, "arquivo.txt");
        boolean newFile = arquivo.createNewFile();
        System.out.println("Arquivo craido? " + newFile);

        File arquivoNovoNome = new File(diretorio, "aquivo_renomeado.txt");
        boolean renamedFile = arquivo.renameTo(arquivoNovoNome);
        System.out.println("Arquivo renomeado? " + renamedFile);

        File diretorioRenomeado = new File("folder2");
        boolean renamedFolder = diretorio.renameTo(diretorioRenomeado);
        System.out.println("Diretorio renomeado? " + renamedFolder);

        System.out.println("##########################################");
        System.out.println("Lista de arquivos: ");
        buscarArquivos();
    }

    public static void buscarArquivos() {
        File file = new File("folder2");

        String[] lista = file.list();

        for (String arquivo : lista){
            System.out.println(arquivo);
        }
    }
}
