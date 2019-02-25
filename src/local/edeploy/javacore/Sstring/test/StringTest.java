package local.edeploy.javacore.Sstring.test;

public class StringTest {
    public static void main(String[] args) {
        String nome = "Francisco";
        nome = nome.concat(" Edenilson");

        String teste1 = "Goku";
        String teste2 = "goKu pai";
        String teste3 = "12345 6 789";
        System.out.println(teste1.charAt(0));
        System.out.println(teste1.equalsIgnoreCase(teste2));
        System.out.println(teste1.length());
        System.out.println(teste1.replace('o', '%'));
        System.out.println(teste1.toLowerCase());
        System.out.println(teste2.toUpperCase());
        System.out.println(teste1.substring(1));
        System.out.println(teste3.substring(0,2));
        System.out.println(teste3.trim());
    }
}
