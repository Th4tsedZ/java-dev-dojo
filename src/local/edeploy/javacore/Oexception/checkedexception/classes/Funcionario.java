package local.edeploy.javacore.Oexception.checkedexception.classes;

import local.edeploy.javacore.Oexception.customexception.LoginInvalidoException;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa {
    @Override
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        super.salvar();
    }
}
