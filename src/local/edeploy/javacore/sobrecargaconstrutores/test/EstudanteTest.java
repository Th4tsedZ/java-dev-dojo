package local.edeploy.javacore.sobrecargaconstrutores.test;

import local.edeploy.javacore.sobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("20195523", "Maria", new double[]{10, 8, 9});
        Estudante estudante2 = new Estudante("20195535", "Breno", new double[]{6, 4, 9}, "01/02/2018");
        estudante1.imprime();
        estudante2.imprime();
    }
}
