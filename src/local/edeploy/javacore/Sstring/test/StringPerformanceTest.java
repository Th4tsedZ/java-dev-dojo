package local.edeploy.javacore.Sstring.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(40000);
        long fim = System.currentTimeMillis();

        System.out.println("Tempo gasto com String: " + (fim - inicio) + "ms");
        System.out.println("----------------------------------");
        inicio = System.currentTimeMillis();
        concatString(40000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto com String builder: " + (fim - inicio) + "ms");
        System.out.println("----------------------------------");
        inicio = System.currentTimeMillis();
        concatString(40000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto com String buffer: " + (fim - inicio) + "ms");
    }

    private static void concatString(int tam){
        String string = "";

        for (int i = 0; i < tam; i++){
            string += i;
        }
    }

    private static void concatStringBuilder(int tam){
        StringBuilder sb = new StringBuilder(tam);

        for (int i = 0; i < tam; i++){
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tam){
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < tam; i++){
            sb.append(i);
        }
    }
}
