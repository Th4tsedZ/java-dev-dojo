package local.edeploy.javacore.Minterfaces.classes;

public class Produto implements Tributavel, Transportavel {
    private String nome;
    private double peso;
    private double preco;
    private double precoFinal;
    private double valorFrete;

    public Produto() {
    }

    public Produto(String nome, double peso, double preço) {
        this.nome = nome;
        this.peso = peso;
        this.preco = preço;
    }

    @Override
    public String toString() {
        return "Valor do produto: R$" + this.precoFinal +
                "\nFrete: R$" + this.valorFrete +
                "\nValor total: R$" + (this.valorFrete + this.precoFinal);
    }

    @Override
    public void calcularImposto() {
        precoFinal = this.preco + (this.preco * IMPOSTO);
    }

    @Override
    public void calculaFrete() {
        this.valorFrete = this.preco / peso * 0.1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public double getValorFrete() {
        return valorFrete;
    }
}
