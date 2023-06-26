import java.util.Scanner;

public class ElBucleWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor instroduzca el numero del que quiera realizar la raiz cuadrada");
        double numero = scanner.nextDouble();

        double candidatoARaizCuadrada = 0.0;

        while (candidatoARaizCuadrada * candidatoARaizCuadrada <= numero) {
            candidatoARaizCuadrada += 0.01;
            System.out.println("Sera el numero " + candidatoARaizCuadrada + "? Su cuadrado es " + candidatoARaizCuadrada);
        }

        candidatoARaizCuadrada -= 0.01;

        System.out.println("La raiz cuadrada que hemos calculado es " + candidatoARaizCuadrada);
        System.out.println("La raiz cuadrada real es " + Math.sqrt(numero));
    }
}
