import java.util.Scanner;

public class ElBucleFor {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor introduzca el primer numero");
        int primerOperado = scanner.nextInt();
        System.out.println("Por favor introduzca el segundo numero");
        int segundoOperado = scanner.nextInt();
        int resultado = 0;

        for(int i = 0; i < segundoOperado; i++) {
            System.out.println("Iteracion numero: " + i);
            resultado+=primerOperado;
        }

        System.out.println("El resultado de multiplicar " + primerOperado + " por " + segundoOperado + " es " + resultado);*/

        int suma = 0;

        for (int i = 1, j = 100 ; i<j; i++, j--) { // Ahora tenemos dos variables de control, la i y la j
            System.out.println("Iteracion numero " + i + " sumando " + i + " y " + j);
            suma = suma + i + j;
        }

        System.out.println("El resultado de sumar los numeros del 1 al 100 es " + suma);
    }
}
