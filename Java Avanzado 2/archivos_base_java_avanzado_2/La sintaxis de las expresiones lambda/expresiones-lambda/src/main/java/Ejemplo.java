import java.util.function.UnaryOperator;

public class Ejemplo {
    private double miDouble = 5.0;
    private String miString = "Hola";

    public void miMetodo() {
        double miDoubleLocal = 7.0;
        String miStringLocal = "Buenos dias";

        UnaryOperator<Double> operator = n -> {
            String miString = "Lambda String";
            System.out.println("Dentro de la expresion lambda this.miString es: " + this.miString);
            return miDouble + n;
        };

        UnaryOperator<String> operator3 = n -> miString + n;
        UnaryOperator<String> operator4 = n -> miStringLocal + n;

        operator.apply(2.0);
    }
}
