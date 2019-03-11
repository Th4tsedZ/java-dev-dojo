package local.edeploy.javacore.Uexpressoesregulares.test;

public class TokenTest {
    public static void main(String[] args) {
        String str = "Willian, Paulo, Joana, Camila, Ana, John, Matheus";

        String [] tokens = str.split(",");

        System.out.print("Nomes: ");
        for (String token : tokens){
            System.out.print(token + " ");
        }


    }
}
