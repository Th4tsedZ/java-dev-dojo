package local.edeploy.javacore.introducaometodos.exercicios;

public class Estudante {
    private String nome;
    private int idade;
    private double notas[] = new double[3];
    private boolean aprovado;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        if (this.idade < 0){
            System.out.println("Idade inválida!");
            return;
        }
        this.idade = idade;
    }
    public void setNotas(double[] notas){
        this.notas = notas;
    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public double[] getNotas(){
        return this.notas;
    }
    public boolean isAprovado(){
        return this.aprovado;
    }

    public void media(double... notas) {
        if (this.notas == null){
            System.out.println("Este aluno não possuí notas!");
            return;
        }
        double media = 0;
        for (double nota : this.notas) {
            media += nota;
        }

        media /= this.notas.length;

        System.out.println("Nome: " + this.nome + "\nIdade: " + this.idade + "\nMédia: " + media);
        if (media > 6) {
            this.aprovado = true;
            System.out.println("Situação: " + this.aprovado);
        } else {
            this.aprovado = false;
            System.out.println("Situação: " + this.aprovado);
        }
    }
}
