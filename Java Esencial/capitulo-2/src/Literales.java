public class Literales {
    public static void main(String[] args) {
        int enteroDecimal = 100; // literal, si lleva un 0 delante es un numero en sistema octal

        int enteroOctal = 0100; // 100 en sistema octal es 64 en sistema decimal

        int enteroHexadecimal = 0x100; // es quivalente a 256 en decimal

        System.out.println("Entero Octal : " + enteroOctal);

        System.out.println("Entero Hexadecimal : " + enteroHexadecimal);

        long numeroLong = 100L;

        double numeroDouble = 2.5;

        float numeroFloat = 2.5f;

        int numeroConGuiones = 25_258_236;

        System.out.println("Numero con Guiones: " + numeroConGuiones);

        char miChar = 'b';
        char miOtroChar = '\u0062'; // b

        System.out.println("El caracter miOtroChar es: " + miOtroChar);

        char comillaSimple = '\'';

        String stringLiteral = "Esto es un literal";

        boolean booleanoVerdaero = true;

        String stringNulo = null;

    }
}
