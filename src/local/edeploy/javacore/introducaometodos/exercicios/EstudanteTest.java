package local.edeploy.javacore.introducaometodos.exercicios;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante aluno1 = new Estudante();
        double notas[] = new double[]{3, 4, 7};

        aluno1.setNome("Francisco");
        aluno1.setIdade(20);
        aluno1.setNotas(notas);

        aluno1.media(notas);
    }
}
