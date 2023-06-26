import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        BinaryOperator<Double> multiplicacion = (x, y) -> x * y;
        System.out.println("El resultado de multiplicar 5 por 6 es " + multiplicacion.apply(5.0, 6.0));

        BinaryOperator<String> concatenacion = (x, y) -> x.concat(y);

    }
}
