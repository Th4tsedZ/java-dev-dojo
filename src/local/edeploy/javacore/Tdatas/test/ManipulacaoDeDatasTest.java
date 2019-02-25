package local.edeploy.javacore.Tdatas.test;

import java.util.Calendar;
import java.util.Date;

public class ManipulacaoDeDatasTest {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        System.out.println(cal.getTime());
        System.out.println(cal.getCalendarType());
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));

        cal.add(Calendar.HOUR, 2);
        Date date2 = cal.getTime();

        System.out.println(date2);
    }
}
