package local.edeploy.javacore.Isobrescrita.classes;

public class Pessoa extends Object{
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString(){
        return("Nome: " + this.nome + "\nIdade: " + this.idade);
    }
}
