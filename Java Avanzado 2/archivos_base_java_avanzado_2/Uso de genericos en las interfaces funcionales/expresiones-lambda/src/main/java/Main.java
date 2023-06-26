public class Main {
    public static void main(String[] args) {
        OperadorBinario multiplicacion = (x, y) -> x * y;
        System.out.println("El resultado de multiplicar 5 por 6 es " + multiplicacion.aplicar(5.0, 6.0));

    }
}
