package local.edeploy.introducao.arrays;

public class Arrays1 {
    public static void main(String[] args) {
        int[] idades = new int[3];

        idades[0] = 10;
        idades[1] = 23;
        idades[2] = 18;

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
    }
}