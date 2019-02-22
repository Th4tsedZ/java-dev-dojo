package local.edeploy.javacore.Npolimorfismo.classes;

public class ArquivoDAOImpli implements GenericDAO {
    @Override
    public void save() {
        System.out.println("Salvando dados nos arquivos!");
    }
}
