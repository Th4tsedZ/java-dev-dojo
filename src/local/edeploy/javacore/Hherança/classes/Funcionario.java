package local.edeploy.javacore.Hherança.classes;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome){
        super(nome);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Salário: R$" + this.salario);
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento() {
        System.out.println("Eu " + this.nome + " recebo R$" + this.salario);
    }
}
