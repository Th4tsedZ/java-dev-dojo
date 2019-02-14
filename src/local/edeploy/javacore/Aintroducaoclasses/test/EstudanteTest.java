package local.edeploy.javacore.Aintroducaoclasses.test;

import local.edeploy.javacore.Aintroducaoclasses.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante joao = new Estudante();

        joao.nome = "Joao";
        joao.matricula = "9955211";
        joao.idade = 18;

        System.out.println(joao.nome);
        System.out.println(joao.matricula);
        System.out.println(joao.idade);
    }

}
