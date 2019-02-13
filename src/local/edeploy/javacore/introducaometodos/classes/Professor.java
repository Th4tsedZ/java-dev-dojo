package local.edeploy.javacore.introducaometodos.classes;

public class Professor {
    public String nome;
    public String matricula;
    public String rg;
    public String cpf;

    public void ImprimirDados(){
        System.out.println("DADOS DO PROFESSOR");
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("RG: " + this.rg);
        System.out.println("CPF: " + this.cpf);
    }
}
