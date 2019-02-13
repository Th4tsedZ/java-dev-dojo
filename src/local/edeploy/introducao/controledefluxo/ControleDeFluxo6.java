package local.edeploy.introducao.controledefluxo;

public class ControleDeFluxo6 {
    public static void main(String[] args) {
        double valor = 30000;
        double valorParcela = 0;
        for (int parcela = (int)valor; parcela >= 1; parcela--){
            valorParcela = valor / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + " R$" + valorParcela);
        }
    }
}
