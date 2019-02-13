package local.edeploy.introducao.controledefluxo;

public class ExercicioControleDeFluxo3 {
    public static void main(String[] args) {
        int valor = 10;

        if (valor > 8 || valor < 1) {
            System.out.println("Valor inválido!");
            System.exit(0);
        } else {
            switch (valor) {
                case 1:
                case 7:
                    System.out.println("Dia não útil!");
                    break;
                default:
                    System.out.println("Dia útil");
            }
        }
    }
}
