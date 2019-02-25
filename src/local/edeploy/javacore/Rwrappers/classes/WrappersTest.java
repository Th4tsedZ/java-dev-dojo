package local.edeploy.javacore.Rwrappers.classes;

public class WrappersTest {
    public static void main(String[] args) {
        byte bytePrimitivo = 1;
        short shortPrimitivo = 1;
        int intPrimitivo = 10;
        long longPrimitivo = 10;
        float floatPrimitivo = 10;
        double doublePrimitivo = 10;
        char charPrimitivo = 'A';
        boolean booleanPrimitivo = true;

        Byte byteWrapper = 1;
        Short shotWrapper = 1;
        Integer intWrapper = 10;
        Long longWrapper = 10L;
        Float floatWrapper = 10F;
        Double doubleWrapper = 10D;
        Character charWrapper = 'A';
        Boolean booleanWrapper = true;

        String valor = "10";

        Float f = Float.parseFloat(valor);

        System.out.println(f);
    }
}
