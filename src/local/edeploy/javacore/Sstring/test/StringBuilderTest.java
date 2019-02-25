package local.edeploy.javacore.Sstring.test;

public class StringBuilderTest {
    public static void main(String[] args) {
        String s = "";
        StringBuilder sb = new StringBuilder(16);

        sb.append("0123456789");

        System.out.println(sb);
        System.out.println(sb.insert(2, "#######"));
    }
}
