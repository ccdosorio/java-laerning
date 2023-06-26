import java.util.Scanner;

public class ElOperadorInterrogante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero entero");
        int dividendo = scanner.nextInt();
        System.out.println("Introduce otro numero entero");
        int divisor = scanner.nextInt();
        int resultado;

        /*if (divisor == 0) {
            resultado = 0;
        }  else {
            resultado = dividendo / divisor;
        }*/

        resultado = divisor == 0 ? 0 : dividendo / divisor;



        System.out.println("El resultado de dividir " + dividendo + " entre " + divisor + " es " + resultado);

    }
}
