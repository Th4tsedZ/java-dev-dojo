package local.edeploy.javacore.Tdatas.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        String mascaraDateFormat = "EEEE',' d 'de' MMMM 'de' y";
        SimpleDateFormat formatador = new SimpleDateFormat(mascaraDateFormat);

        System.out.println(formatador.format(c.getTime()));
    }
}