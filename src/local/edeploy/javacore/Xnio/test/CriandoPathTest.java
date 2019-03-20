package local.edeploy.javacore.Xnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CriandoPathTest {
    public static void main(String[] args) throws IOException {
//        Path p1 = Paths.get("D:\\projetos java\\java-dev-dojo\\folder2\\arquivo.txt");
//        Path p2 = Paths.get("D:\\projetos java\\java-dev-dojo\\folder2", "arquivo.txt");
//        Path p3 = Paths.get("D:", "projetos java\\java-dev-dojo\\folder2", "arquivo.txt");

//        System.out.println("Caminho absoluto: " + p1.toAbsolutePath());

//        File file = p3.toFile();
//        Path path = file.toPath();

        Path path1 = Paths.get("pasta1");
        Path path2 = Paths.get("pasta2\\subpasta\\subpasta");
        Path arquivo = Paths.get("pasta2\\subpasta\\subpasta\\arquivo.txt");

        if (Files.notExists(arquivo.getParent())) {
            Files.createDirectories(arquivo.getParent());
            System.out.println("Pastas \"" + arquivo.getParent() + "\" criadas com sucesso!");
        } else {
            System.out.println("Pastas \"" + arquivo.getParent() + "\" já existem!");
        }

        if (Files.notExists(arquivo.toAbsolutePath())) {
            Files.createFile(arquivo);
            System.out.println("Arquivo \"" + arquivo.getFileName() + "\" criado com sucesso!");
        } else {
            System.out.println("Arquivo \"" + arquivo.getFileName() + "\" já existe!");
        }

        Path source = Paths.get("folder2\\arquivo.txt");
        Path target = Paths.get("pasta2\\subpasta\\subpasta\\arquivoCopiado.txt");

        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Arquivo \"" + target.getFileName() + "\" copiado com sucesso!");

        Files.deleteIfExists(target);

//        if (Files.notExists(path1.toAbsolutePath())){
//            Files.createDirectory(path1);
//            System.out.println("Pasta " + path1.getName(0) + " criada com sucesso!");
//        } else {
//            System.out.println("Pasta já existe!");
//        }
//
//        if (Files.notExists(path2.toAbsolutePath())) {
//            Files.createDirectories(path2);
//            System.out.println("Pasta " + path2.getName(0) + " e suas subpastas foram criadas com sucesso!");
//        } else {
//            System.out.println("Pasta já existe!");
//        }

    }
}
