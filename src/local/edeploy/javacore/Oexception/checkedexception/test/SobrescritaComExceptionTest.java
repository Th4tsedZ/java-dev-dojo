package local.edeploy.javacore.Oexception.checkedexception.test;

import local.edeploy.javacore.Oexception.checkedexception.classes.Funcionario;
import local.edeploy.javacore.Oexception.checkedexception.classes.Pessoa;
import local.edeploy.javacore.Oexception.customexception.LoginInvalidoException;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        Pessoa p = new Pessoa();

        try {
            f.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
