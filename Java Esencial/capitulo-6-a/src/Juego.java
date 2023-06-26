public class Juego {
    private int numeroDeJugadores;
    private int puntuacion = 0;

    public Juego(int numeroDeJugadores) {
        this.numeroDeJugadores = numeroDeJugadores;
    }

    public int obtenerPuntuacion() {
        return puntuacion;
//        incrementarPuntuacion() NO SE PUEDE ACCEDER
    }

    public class Contador {

        public void incrementarPuntuacion(int puntos) {
            puntuacion += puntos;
        }

        public void decrementarPuntuacion(int puntos) {
            puntuacion -= puntos;
        }

    }
}
