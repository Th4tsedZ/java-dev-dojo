package local.edeploy.javacore.Xnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizarTest {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/francisco");
        Path classe = Paths.get("/home/francisco/java/pessoa.java");
        Path pathToClasse = dir.relativize(classe);

        //Do caminho do dir para chegar na classe pessoa.java eu preciso percorrer pathToClasse. Elimina o que há de comum entre os dois caminhos
        System.out.println(pathToClasse);

        Path absoluto1 = Paths.get("/home/francisco");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/francisco/java/pessoa.java");

        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/Funcaionario.java");

        System.out.println("1: " + absoluto1.relativize(absoluto3));
        System.out.println("2: " + absoluto3.relativize(absoluto1));
        System.out.println("3: " + absoluto1.relativize(absoluto2));
        System.out.println("4: " + relativo1.relativize(relativo2));
        System.out.println("5: " + absoluto1.relativize(relativo1));
    }
}
