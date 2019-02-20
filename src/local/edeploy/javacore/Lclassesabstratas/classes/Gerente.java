package local.edeploy.javacore.Lclassesabstratas.classes;

public class Gerente extends Funcionario {

    public Gerente() {
    }

    public Gerente(String nome, String CLT, double salario) {
        super(nome, CLT, salario);
    }

    @Override
    public double calculaSalario() {
        System.out.print("Salário após acréscimos: R$");
        return super.getSalario() + super.getSalario() * 0.2;
    }
}
