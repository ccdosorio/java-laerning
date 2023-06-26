public class Main {
    public static void main(String[] args) {
        Caja<String> caja1 = new Caja<>("Hola");

        Integer numero = 5;

        Caja<Integer> caja2 = new Caja<>(numero);
        String miObjeto = "Perro";

        System.out.println("La variable1 contiene un objeto cuyo elemento es de la misma clase que miObjeto? " + caja1.perteneceElContenidoALaMismaClase(miObjeto));
        System.out.println("La variable2 contiene un objeto cuyo elemento es de la misma clase que miObjeto? " + caja2.perteneceElContenidoALaMismaClase(miObjeto));
    }
}