package local.edeploy.introducao.controledefluxo;

public class ExercicioControleDeFluxo1 {
    public static void main(String[] args) {
        double salario = 2000;
        double desconto_salario;

        if (salario < 1000){
            desconto_salario = salario * 0.05;
        } else if (salario >= 1000 && salario < 2000){
            desconto_salario = salario * 0.10;
        } else if (salario >= 2000 && salario < 5000){
            desconto_salario = salario * 0.15;
        } else{
            desconto_salario = salario * 0.20;
        }
        System.out.println("O desconto do salário eh de: R$" + desconto_salario);
    }
}
