public class Main {
    public static void main(String[] args) {
        Animal perro = new Animal("Canis Lupus", 4);
        Animal gato = new Animal("Fis silvestris", 4);
        Animal otroPerro = new Animal("Canis Lupus", 4);

        System.out.println("Es igual el objeto de gato igual al objeto de perro? " + perro.equals(gato));

        System.out.println("Es igual el objeto de otro perro al objeto de perro? " + perro.equals(otroPerro));

        System.out.println("Hashcode para perro: " + perro.hashCode());
        System.out.println("Hashcode para gato: " + gato.hashCode());
        System.out.println("Hashcode para otroPerro: " + otroPerro.hashCode());

        System.out.println("Nuestro obeto perro en forma de String: " + perro.toString());
    }
}