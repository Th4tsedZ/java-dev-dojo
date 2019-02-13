package local.edeploy.introducao.controledefluxo;

public class ControleDeFluxo1 {
    public static void main(String[] args) {
        int idade = 20;
        String categoria;

        if (idade < 15) {
            categoria = "Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Juvenil";
        } else {
            categoria = "Adulto";
        }
        System.out.println("A categoria do aluno eh: " + categoria);
    }
}
