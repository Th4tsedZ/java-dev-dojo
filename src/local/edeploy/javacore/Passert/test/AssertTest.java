package local.edeploy.javacore.Passert.test;

public class AssertTest {
    public static void main(String[] args) {
        calculaSalario(-10000);
    }

    private static void calculaSalario(double salario){
        assert (salario > 0);
    }
}
