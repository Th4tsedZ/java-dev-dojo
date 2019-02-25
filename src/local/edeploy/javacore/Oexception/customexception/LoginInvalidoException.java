package local.edeploy.javacore.Oexception.customexception;

public class LoginInvalidoException extends Exception{

    public LoginInvalidoException(){
        super("Usuário ou senha inválidos");
    }
}
