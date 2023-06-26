import java.util.Scanner;

public class IntroduccionCaracteresTeclado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Como te llamas?");
        String nombre = scanner.nextLine();
        System.out.println("Hola " + nombre + " Bienvenido!");
        System.out.println("Introduce tu edad");
        int edad = scanner.nextInt();
        System.out.println("Tienes " + edad + " años");
    }
}
