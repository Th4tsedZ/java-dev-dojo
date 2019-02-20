package local.edeploy.javacore.Kunum.classes;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa física"), PESSOA_JURIDICA(2, "Pessoa jurídica");

    private int tipo;
    private String nomeTipo;

    TipoCliente(int tipo, String nomeTipo) {
        this.tipo = tipo;
        this.nomeTipo = nomeTipo;
    }

    public int getTipo() {
        return tipo;
    }

    public String getNomeTipo() {
        return nomeTipo;
    }
}


