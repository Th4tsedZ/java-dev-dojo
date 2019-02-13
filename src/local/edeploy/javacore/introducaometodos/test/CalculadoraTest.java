package local.edeploy.javacore.introducaometodos.test;

import local.edeploy.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        int numeros[] = new int[]{1, 2, 3, 4, 5};

        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(6, 2);
        System.out.println(calc.divideDoisNumeros(10, 5));
        calc.imprimeDoisNumerosDivididos(25, 5);
        calc.somaArray(numeros);
        calc.somaVarArgs(numeros);
    }
}