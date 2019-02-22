package local.edeploy.javacore.Npolimorfismo.classes;

public class RelatorioPagamento {
    public void relatorioPagamentoGenerico(Funcionario funcionario) {
        System.out.println("Gerando relatório de pagamento");
        funcionario.calcularPagamento();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário: R$" + funcionario.getSalario());
        if (funcionario instanceof Gerente){
            System.out.println("Participação nos lucros: " + ((Gerente) funcionario).getPnl());
        } else if (funcionario instanceof Vendedor){
            System.out.println("Total de vendas : " + ((Vendedor) funcionario).getTotalVendas());
        }
    }
}
