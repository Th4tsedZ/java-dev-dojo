package local.edeploy.javacore.Gassociacao.exercicios.test;

import local.edeploy.javacore.Gassociacao.exercicios.classes.Aluno;
import local.edeploy.javacore.Gassociacao.exercicios.classes.Local;
import local.edeploy.javacore.Gassociacao.exercicios.classes.Professor;
import local.edeploy.javacore.Gassociacao.exercicios.classes.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Francisco", 20);
        Aluno aluno2 = new Aluno("Goku", 32);
        Seminario seminario1 = new Seminario("Política dos dados");
        Professor professor1 = new Professor("João Cleber", "Análise de dados");
        Local local1 = new Local("Rua das margaridas verde azuladas", "Jardim Elvira");

        seminario1.setProfessor(professor1);
        seminario1.setLocal(local1);
        seminario1.setAlunos(new Aluno[]{aluno1, aluno2});
        professor1.setSeminarios(new Seminario[]{seminario1});
        aluno1.setSeminario(seminario1);
        aluno2.setSeminario(seminario1);

        seminario1.print();
        professor1.print();
        aluno1.print();
        local1.print();
    }
}
