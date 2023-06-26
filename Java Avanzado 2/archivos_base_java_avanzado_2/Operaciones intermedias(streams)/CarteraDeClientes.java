import java.util.ArrayList;
import java.util.stream.Stream;

public class CarteraDeClientes {

    public static void main(String[] args) {
        ArrayList<Cliente> clientes = crearListaDeClientes();

//        clientes.stream()
//                .filter(cliente -> cliente.getNombre().startsWith("M"))
//                .peek(cliente -> System.out.println("Cliente cuyo nombre comienza con M: " + cliente))
//                .filter(cliente -> cliente.getPais().equalsIgnoreCase("MEXICO"))
//                .peek(cliente -> System.out.println("Cliente cuyo nombre comienza con M y es de mexico: " + cliente))
//                .count();

        Stream.of("Maria", "Pedro", "Juan")
                .distinct()
                .sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    static ArrayList<Cliente> crearListaDeClientes() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("GREGORIO", "HINOJOSA", "MÉXICO"));
        clientes.add(new Cliente("LORENA", "DE LUCAS", "COLOMBIA"));
        clientes.add(new Cliente("LAURA", "GARATE", "ESPAÑA"));
        clientes.add(new Cliente("JUAN CARLOS", "MORATALLA", "ARGENTINA"));
        clientes.add(new Cliente("JOSE CARLOS", "CORRALES", "PERÚ"));
        clientes.add(new Cliente("SEBASTIAN", "GALAN", "VENEZUELA"));
        clientes.add(new Cliente("JUANA", "MERA", "ARGENTINA"));
        clientes.add(new Cliente("MÓNICA", "MENDIZABAL", "MÉXICO"));
        clientes.add(new Cliente("PEDRO", "GARCÍA", "ESPAÑA"));
        clientes.add(new Cliente("ALBA", "ESPEJO", "CHILE"));
        clientes.add(new Cliente("JAIME", "VIZUETE", "ECUADOR"));
        clientes.add(new Cliente("MARÍA MAR", "CHECA", "GUATEMALA"));
        clientes.add(new Cliente("MARÍA", "CABANILLAS", "ARGENTINA"));
        clientes.add(new Cliente("JOSE CARLOS", "ARTIGAS", "BOLIVIA"));
        clientes.add(new Cliente("MANUEL", "SANTAMARIA", "REPÚBLICA DOMINICANA"));
        clientes.add(new Cliente("SILVIA", "GAMERO", "HONDURAS"));
        clientes.add(new Cliente("LUCIA", "ALCOLEA", "EL SALVADOR"));
        return clientes;
    }
}
