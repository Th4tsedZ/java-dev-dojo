package local.edeploy.javacore.Gassociacao.exercicios.classes;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor() {
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public void print(){
        System.out.println("\n\nRelatório de professores ----------------------------------------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if(this.getSeminarios() != null && seminarios.length != 0){
            System.out.printf("Seminários: ");
            for (Seminario seminario : seminarios){
                System.out.println(seminario.getTitulo() + "... ");
            }
        } else {
            System.out.println("Seminários: professor não vinculado a nenhum seminário");
        }
    }
}
