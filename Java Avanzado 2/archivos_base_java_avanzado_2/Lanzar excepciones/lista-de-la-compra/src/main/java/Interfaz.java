import java.io.IOException;
import java.util.Scanner;

public class Interfaz {

    private ListaDeLaCompra listaDeLaCompra;

    public Interfaz(String archivo) {
        try {
            listaDeLaCompra = new ListaDeLaCompra(archivo);
        } catch (IOException e) {
            System.out.println("Ha ocurrido un problema con el archivo mi-lista.txt");
        }
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcionElegida;
        do {
            System.out.println("Para salir introduzca 0");
            System.out.println("Para ver un elemento introduzca la posición del elemento");
            System.out.println("Para añadir un elemento introduzca -1");
            opcionElegida = scanner.nextInt();

            switch (opcionElegida) {
                case 0:
                    break;
                case -1:
                    insertarElemento();
                    break;
                default:
                    mostrarElemento(opcionElegida);
            }
        } while (opcionElegida != 0);

    }

    private void mostrarElemento(int posicion) {

        System.out.println("El elemento número " + posicion + " de la lista es " + listaDeLaCompra.obtenerElemento(posicion));
    }

    private void insertarElemento() {
        Scanner scanner = new Scanner(System.in);
        String elemento;
        System.out.println("¿Qué elemento desea añadir?");
        elemento = scanner.nextLine();
        try {
            listaDeLaCompra.insertarElemento(elemento);
        } catch (IOException e) {
            System.out.println("Ha ocurrido un problema con el archivo mi-lista.txt");
        }
    }
}
