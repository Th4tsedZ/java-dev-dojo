package local.edeploy.javacore.Npolimorfismo.classes;

public class DatabaseDAOImpli implements GenericDAO{
    @Override
    public void save() {
        System.out.println("Salvando dados no banco de dados!");
    }
}
