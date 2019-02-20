package local.edeploy.javacore.Lclassesabstratas.classes;

public abstract class Funcionario extends Pessoa {
    protected String CLT;
    protected double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String CLT, double salario) {
        this.nome = nome;
        this.CLT = CLT;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome +
                "\nNúmero da CLT: " + this.CLT +
                "\nSalário base: R$" + this.salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCLT() {
        return CLT;
    }

    public void setCLT(String CLT) {
        this.CLT = CLT;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double calculaSalario();
}
