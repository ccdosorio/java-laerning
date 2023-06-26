public class Main {
    public static void main(String[] args) {
        System.out.println("La variable estatica apellido de la clase Hermano es " + Hermano.apellido);

        Hermano hermanoPequeno = new Hermano();
        hermanoPequeno.nombre = "Christian";
        Hermano hermanoMayor = new Hermano();
        hermanoMayor.nombre = "Fernando";
        System.out.println("El hermano pequeno se llama " + hermanoPequeno.nombre + " " + hermanoPequeno.apellido);
        System.out.println("El hermano mayor se llama " + hermanoMayor.nombre + " " + hermanoMayor.apellido);

        hermanoPequeno.nombre = "David";

        System.out.println("El hermano pequeno se llama " + hermanoPequeno.nombre + " " + hermanoPequeno.apellido);
        System.out.println("El hermano mayor se llama " + hermanoMayor.nombre + " " + hermanoMayor.apellido);

        hermanoPequeno.apellido = "Chacon"; // el apellido se cambiar para los dos ya que comparten una instancia

        System.out.println("El hermano pequeno se llama " + hermanoPequeno.nombre + " " + hermanoPequeno.apellido);
        System.out.println("El hermano mayor se llama " + hermanoMayor.nombre + " " + hermanoMayor.apellido);

    }
}