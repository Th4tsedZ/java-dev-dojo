package local.edeploy.javacore.Oexception.runtimeexception.test;

public class RuntimeExceptionTest {
    public static void main(String[] args) {
        divisao(10, 0);
    }

    private static void divisao(double num1, double num2) {
        if (num2 == 0){
            throw new IllegalArgumentException("O número não pode ser dividido por 0");
        } else {
            System.out.println(num1 / num2);
        }
    }
}
