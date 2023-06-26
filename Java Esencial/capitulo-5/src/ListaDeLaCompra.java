import java.util.ArrayList;

public class ListaDeLaCompra {
    public static void main(String[] args) {
        ArrayList<String> miListaDeLaCompra = new ArrayList<>();
        miListaDeLaCompra.add("Patatas");
        miListaDeLaCompra.add("Leche");
        miListaDeLaCompra.add("Manzanas");

        System.out.println("Mis lista de la compra tiene " + miListaDeLaCompra);

        ArrayList<String> miListaDeEnero = new ArrayList<>(miListaDeLaCompra);

        miListaDeEnero.add("Harina");

        System.out.println("Mis lista enero con mi lista de la compra" + miListaDeEnero);

        ArrayList<String> miListaDeFebrero = miListaDeLaCompra; // Aqui si modifico mi lista de la compra

        System.out.println("El primer elemento de mi lista de la compra de enero es " + miListaDeEnero.get(0));

        miListaDeEnero.set(1, "Leche entera");

        miListaDeEnero.remove(0);

        System.out.println("miListaDeEnero: " + miListaDeEnero);

        miListaDeEnero.remove("Manzanas");

        System.out.println("miListaDeEnero: " + miListaDeEnero);

        miListaDeEnero.size(); // tamano de la lista

    }
}
