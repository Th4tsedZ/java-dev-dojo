package local.edeploy.javacore.Npolimorfismo.test;

import local.edeploy.javacore.Npolimorfismo.classes.ArquivoDAOImpli;
import local.edeploy.javacore.Npolimorfismo.classes.GenericDAO;

public class DAOTest {
    public static void main(String[] args) {
        GenericDAO arquivoDAO = new ArquivoDAOImpli();

        arquivoDAO.save();
    }
}
