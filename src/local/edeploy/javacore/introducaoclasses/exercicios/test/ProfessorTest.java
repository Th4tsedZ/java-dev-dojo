package local.edeploy.javacore.introducaoclasses.exercicios.test;

import local.edeploy.javacore.introducaoclasses.exercicios.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor1 = new Professor();

        professor1.nome = "Marcos";
        professor1.matricula = "2019223221";
        professor1.rg = "12.225.446-X";
        professor1.cpf = "123.585.145-21";

        professor1.ImprimirDados();
    }
}
