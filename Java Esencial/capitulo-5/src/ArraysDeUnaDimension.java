public class ArraysDeUnaDimension {
    public static void main(String[] args) {
        String diasDeLaSemana[] = new String[7];
        diasDeLaSemana[0] = "Lunes";
        diasDeLaSemana[1] = "Martes";
        diasDeLaSemana[2] = "Miercoles";
        diasDeLaSemana[3] = "Jueves";
        diasDeLaSemana[4] = "Viernes";
        diasDeLaSemana[5] = "Sabado";
        diasDeLaSemana[6] = "Domingo";

        System.out.println("El segundo dia de la semana es " + diasDeLaSemana[1]);

        int numeros[] = { 8, 9, 85, -6 };

        int  minimo, maximo;
        minimo = maximo = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maximo) maximo = numeros[i];
            if (numeros[i] < minimo) minimo = numeros[i];
        }

        double[] miArrayDeDoubles = {2.3, 6.0, 25, 8.36};
    }
}
