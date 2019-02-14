package local.edeploy.javacore.Bintroducaometodos.test;

import local.edeploy.javacore.Bintroducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor1 = new Professor();

        professor1.nome = "Jao";
        professor1.matricula = "223352";
        professor1.rg = "22.554.652-X";
        professor1.cpf = "123.585.145-21";

        professor1.ImprimirDados();
    }
}
