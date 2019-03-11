package local.edeploy.javacore.Uexpressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExepressoesRegulares {
    public static void main(String[] args) {
        // \d - todos os digitos
        // \D - tudo o que não for dígito
        // \s - espaços em branco
        // \S - caractere que não é branco
        // \w - letras a-z A-Z, digitos e _
        // \W - tudo que não for caractere de palavra
        // []
        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n, m} de n até m ocorrências
        // () agrupamento
        // | ou
        // $ fim da linha
        // ^ negação

//        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
//        String texto = "12 0x 0X 0xFFABC 0X10G 0x1";

//        String regex = "([\\w\\.])+@([a-z-A-Z])+(\\.([a-z-A-Z])+)+";
//        String texto = "fulano@hotmail.com";

//        String regex = "\\d{2}/\\d{2}/\\d{4}";
//        String texto = "05/10/2010 05/5/2015 1/1/01 01/05/95"; // dd/mm/yyyy

        String regex = "proj[^,]*";
        String texto = "proj1.bkp, proj1.java, proj1.class, proj2.bkp, proj3.class, foto, diagrama.uml";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println(texto.matches(regex));
        System.out.println("texto:  " + texto);
        System.out.println("índice: 0123456789");
        System.out.println("expressão: " + matcher.pattern());
        System.out.print("Resultados:");
        while (matcher.find()){
            System.out.print(matcher.group() + " | ");
        }
    }
}
