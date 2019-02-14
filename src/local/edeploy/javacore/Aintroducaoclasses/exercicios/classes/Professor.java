package local.edeploy.javacore.Aintroducaoclasses.exercicios.classes;

public class Professor {
    public String nome;
    public String matricula;
    public String rg;
    public String cpf;

    public void ImprimirDados(){
        System.out.println("DADOS DO PROFESSOR");
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("RG: " + rg);
        System.out.println("CPF: " + cpf);
    }
}
