package local.edeploy.javacore.Tdatas.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {
        float valor = 123.4567f;
        Locale localBR = new Locale("pt", "br");
//        NumberFormat[] nfa = new NumberFormat[4];

//        nfa[0] = NumberFormat.getInstance();
//        nfa[1] = NumberFormat.getInstance(localBR);
//        nfa[2] = NumberFormat.getCurrencyInstance();
//        nfa[3] = NumberFormat.getCurrencyInstance(localBR);
//
//        for (NumberFormat nf : nfa){
//            System.out.println(nf.format(valor));
//        }

        NumberFormat nf =  NumberFormat.getCurrencyInstance(localBR);
        nf.setMaximumFractionDigits(2);

        System.out.println(nf.format(valor));

    }
}
