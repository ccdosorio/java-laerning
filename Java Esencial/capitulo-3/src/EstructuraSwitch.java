import java.util.Scanner;

public class EstructuraSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor introduzca un dia de la semana en que quiere su cita");
        String dia = scanner.nextLine();

        switch (dia) {
            case "lunes":
                System.out.println("El lunes puede venir de 11:00 a 12:00");
                break;
            case "martes":
                System.out.println("El martes puede venir de 3:30 a 5:30");
                break;
            case "miercoles":
                System.out.println("El miercoles puede venir de 11:00 a 12:30");
                break;
            case "sabado":
            case "domingo":
                System.out.println("Esta cerrado");
                break;
            default:
                System.out.println("No ha introducido un dia valido");
        }
    }
}
