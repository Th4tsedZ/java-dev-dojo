package local.edeploy.javacore.Tdatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        Locale localeBrasil = new Locale("pt", "br");
        Locale localeUs = new Locale("en", "us");
        Locale localeIndia = new Locale("hi", "in");
        Locale localeIJapao = new Locale("ja");

        Calendar calendar = Calendar.getInstance();
        DateFormat dfbr = DateFormat.getDateInstance(DateFormat.FULL, localeBrasil);
        DateFormat dfus = DateFormat.getDateInstance(DateFormat.FULL, localeUs);
        DateFormat dfin = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat dfjp = DateFormat.getDateInstance(DateFormat.FULL, localeIJapao);

        System.out.println(dfbr.format(calendar.getTime()));
        System.out.println(dfus.format(calendar.getTime()));
        System.out.println(dfin.format(calendar.getTime()));
        System.out.println(dfjp.format(calendar.getTime()));

        System.out.println(localeBrasil.getDisplayCountry());
        System.out.println(localeBrasil.getDisplayLanguage());

        System.out.println(calendar.getTime());
    }
}
