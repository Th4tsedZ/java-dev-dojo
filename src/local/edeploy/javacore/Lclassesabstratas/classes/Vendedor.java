package local.edeploy.javacore.Lclassesabstratas.classes;

public class Vendedor extends Funcionario {

    private double totalVendas;

    public Vendedor() {
    }

    public Vendedor(String nome, String CLT, double salario, double totalVendas) {
        super(nome, CLT, salario);
        this.totalVendas = totalVendas;
    }

    @Override
    public double calculaSalario() {
        System.out.print("Salário após acréscimos: R$");
        return super.getSalario() + this.totalVendas * 0.05;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
}
