package local.edeploy.javacore.Fmodificadorestatico.classes;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 240;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro() {
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public double getVelocidadeLimite(){
        return velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println();
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade máxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade limite: " + velocidadeLimite);
        System.out.println("\n---------------------------------------------------");
    }


}
