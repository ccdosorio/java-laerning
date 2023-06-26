public class PracticaConStrings {
    public static void main(String[] args) {
        /*String unString = new String("Soy un string");
        String otroString = new String(unString);

        String miTercerString = "Este string se crea directamente con una cadena de caracteres entrecomillada";*/

        String miString = "abcde";
        char caracter;
        caracter = miString.charAt(2);

        System.out.println("El caracter en la posicion 2 es " + caracter);

        String resultadoConcat = miString.concat("fghij");

        System.out.println("El resultado de la concatenacion es " + resultadoConcat);

        String concatenacionSencilla = "abcde" + "fghij";

        System.out.println("El resultado de la concatenacion sencilla es " + concatenacionSencilla);

        System.out.println("Son iguales los string? " + concatenacionSencilla.equals(resultadoConcat));

        resultadoConcat.length();
        concatenacionSencilla.equalsIgnoreCase(resultadoConcat); // Ignora mayusculas y minusculas
    }
}
