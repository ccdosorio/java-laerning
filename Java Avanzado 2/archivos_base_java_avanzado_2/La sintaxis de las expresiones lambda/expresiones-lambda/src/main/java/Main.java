import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        MiValor miValor = () -> 2.8;
        System.out.println("Si ejecuto mi valor miValor.obtenerValor obtengo " + miValor.obtenerValor());

        OperadorUnario raizCuadrada = n -> Math.sqrt(n);

        System.out.println("La raiz cuadrada de 4 es " + raizCuadrada.aplicar(4.0));

        OperadorUnario triple = n -> 3 * n;

        OperadorBinario multiplicacion = (x, y) -> x * y;

        System.out.println("El resultado de 5 * 6 es:  " + multiplicacion.aplicar(5.0, 6.0));

        OperadorBinario minimoComunMultiplo = (x, y) -> {
            double mcm;

            if (x>y) {
                mcm = x;
            } else {
                mcm = y;
            }

            while (mcm % x !=0 || mcm % y != 0) {
                mcm++;
            }

            return mcm;
        };

        System.out.println("El minimo comun multiplo de 12 y 9 es : " + minimoComunMultiplo.aplicar(12, 9));

        OperadorBinarioGenerico<String> concatenacion = (x, y) -> x.concat(y);
        OperadorBinarioGenerico<Double> multi = (x, y) -> x * y;

        BinaryOperator<String> concat2 = (x, y) -> x.concat(y);

        System.out.println(concat2.apply("Hola", "Mundo"));

    }
}
