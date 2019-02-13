package local.edeploy.introducao.arrays;

public class Arrays6 {
    public static void main(String[] args) {
        int[][] dias = {{1, 2},{3, 4, 5},{7, 8, 9, 0}};

//        dias[0] = new int[]{1, 2};
//        dias[1] = new int[]{3, 4, 5};
//        dias[2] = new int[]{7, 8, 9, 10};

        for (int[] ref : dias) {
            for (int dia : ref) {
                System.out.print(dia);
            }
            System.out.println();
        }
    }
}