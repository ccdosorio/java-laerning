public class Nivel {
    public static void main(String[] args) {
        Personaje enemigo = new Personaje(10, 0);
        Protagonista protagonista = new Protagonista(0, 0, "Christian");

        enemigo.emitirSonidoDeDolor();

        protagonista.emitirSonidoDeDolor();


    }
}
