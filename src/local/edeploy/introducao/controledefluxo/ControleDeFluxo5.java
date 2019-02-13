package local.edeploy.introducao.controledefluxo;

public class ControleDeFluxo5 {
    public static void main(String[] args) {
        double valor = 30000;
        double valorParcela = 0;

        for (int parcela = 1; parcela <= valor; parcela++) {
            valorParcela = valor / parcela;

            if (valorParcela  < 1000){
                break;
            } else {
                System.out.println("Parcela " + parcela + " R$" + valorParcela);
            }
        }
    }
}
