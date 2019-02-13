package local.edeploy.introducao.controledefluxo;

public class ExercicioControleDeFluxo4 {
    public static void main(String[] args) {
        System.out.println("Números pares entre 0 e 100000:");
        for (int i = 0; i < 100000; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}