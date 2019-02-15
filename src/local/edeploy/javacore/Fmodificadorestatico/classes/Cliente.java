package local.edeploy.javacore.Fmodificadorestatico.classes;

public class Cliente {
    private static int[] parcelas = new int[100];

    static {
        for (int i = 1; i <= 100; i++) {
            parcelas[i - 1] = i;
        }
    }

    public Cliente() {
    }

    public static int[] getParcelas() {
        return parcelas;
    }
}
