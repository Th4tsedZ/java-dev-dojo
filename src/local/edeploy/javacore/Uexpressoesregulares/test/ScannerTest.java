package local.edeploy.javacore.Uexpressoesregulares.test;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner("1 true 100 oi");
//
//        while (scanner.hasNext()){
//            System.out.println(scanner.next());
//        }
//
//        System.out.println("#############################################");
        Scanner scanner = new Scanner("1 true 100 oi");

        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println(i);
            } else if(scanner.hasNextBoolean()){
                boolean b = scanner.nextBoolean();
                System.out.println(b);
            } else {
                System.out.println(scanner.next());
            }
        }
    }
}
