public class Hermano {
    String nombre;
    static String apellido = "Osorio";

    static String obtenerApellido() {
//        return nombre; Esto no se puede hacer porque nombre no es estatico
        return apellido;
    }

    static void modificarApellido(String nuevoApellido) {
        apellido = nuevoApellido;
    }
}
