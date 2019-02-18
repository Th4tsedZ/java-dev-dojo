package local.edeploy.javacore.Jmodificadorfinal.classes;

public class Carro {
    public static final double VELOCIDADE_LIMITE = 250;
    private String nome;
    private String marca;
    private final Comprador COMPRADOR = new Comprador();

    @Override
    public String toString() {
        return "nome: " + nome +
                "\nmarca: " + marca;
    }

    public static double getVelocidadeFinal() {
        return VELOCIDADE_LIMITE;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Comprador getComprador() {
        return COMPRADOR;
    }
}
