public class Triangulo extends Figura2D {

    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double obtenerArea() {
        double semiPerimetro = (lado1 + lado2 + lado3) / 2;
        double area = Math.sqrt(semiPerimetro * (semiPerimetro - lado1) * (semiPerimetro - lado2) * (semiPerimetro - lado3));
        return area;
    }

    @Override
    public double obtenerPerimetro() {
        return lado1 + lado2 + lado3;
    }
}
