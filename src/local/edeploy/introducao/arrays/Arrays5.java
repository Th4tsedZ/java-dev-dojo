package local.edeploy.introducao.arrays;

import java.util.HashMap;
import java.util.Map;

public class Arrays5 {
    public static void main(String[] args) {
        int [][] dias = new int[2][2];
        dias[0][0] = 30;
        dias[0][1] = 31;

        dias[1][0] = 29;
        dias[1][1] = 28;

//        for (int i = 0; i < dias.length; i++){
//            for (int c = 0; c < dias.length; c++){
//                System.out.print(dias[i][c]+" ");
//            }
//            System.out.println("");
//        }

        for (int[] ref : dias){
            for (int dia : ref){
                System.out.print(dia + " ");
            }
            System.out.println();
        }
    }
}