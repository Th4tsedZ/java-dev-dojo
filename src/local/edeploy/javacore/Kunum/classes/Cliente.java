package local.edeploy.javacore.Kunum.classes;

public class Cliente {
    public enum TipoPagamento{
        AVISTA("A vísta"), APRAZO("A prazo");

        String nomeTipoPagamento;

        TipoPagamento(String nomeTipoPagamento) {
            this.nomeTipoPagamento = nomeTipoPagamento;
        }

        public String getNomeTipoPagamento() {
            return nomeTipoPagamento;
        }
    }

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    @Override
    public String toString() {
        return "Nome: " + this.nome +
                "\nTipo de cliente: " + this.tipoCliente.getNomeTipo() +
                "\nTipo de pagamento: " + this.tipoPagamento.getNomeTipoPagamento() +
                "\nValor de identificação do pagamento: " + tipoCliente.getTipo();
    }

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
