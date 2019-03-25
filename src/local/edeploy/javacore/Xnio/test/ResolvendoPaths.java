package local.edeploy.javacore.Xnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolvendoPaths {
    public static void main(String[] args) {
        Path diretorio = Paths.get("home\\francisco");
        Path arquivo = Paths.get("dev\\arquivo.txt");
        Path result = diretorio.resolve(arquivo);
        System.out.println(result);

        Path abs = Paths.get("/home/francisco");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");

        System.out.println("1: " + abs.resolve(relativo));
        System.out.println("2: " + abs.resolve(file));
        System.out.println("3: " + relativo.resolve(file));
        System.out.println("4: " + relativo.resolve(abs));
        System.out.println("5: " + file.resolve(abs));
        System.out.println("6: " + file.resolve(relativo));

    }
}
