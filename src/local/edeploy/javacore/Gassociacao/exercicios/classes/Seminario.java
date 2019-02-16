package local.edeploy.javacore.Gassociacao.exercicios.classes;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Seminario() {
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public void print() {
        System.out.println("\nRelatório de seminários ----------------------------------------------------------------");
        System.out.println("Título: " + this.titulo);
        if (this.professor != null && this.alunos != null && alunos.length != 0 && this.local != null) {
            System.out.println("Professor orientador: " + this.professor.getNome());
            System.out.print("Alunos: ");
            for (Aluno alunos : this.alunos) {
                System.out.print(alunos.getNome() + "... ");
            }
            System.out.print("\nLocal: " + this.local.getRua() + ", " + this.local.getBairro());
        } else {
            if (this.professor == null) {
                System.out.println("Professor: seminário não está vinculado a nenhum professor");
            }
            if (this.alunos == null) {
                System.out.println("Alunos: seminário não está vinculado a nenhum aluno");
            }
            if (this.local == null) {
                System.out.println("Local: seminário não vinculado a nenhum local");
            }
        }
    }
}
