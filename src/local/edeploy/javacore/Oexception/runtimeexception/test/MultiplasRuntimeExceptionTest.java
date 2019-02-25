package local.edeploy.javacore.Oexception.runtimeexception.test;

import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionTest {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            e.printStackTrace();
        }

        try {
            talvezLanceException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void talvezLanceException() throws SQLException, IOException {
    }
}
