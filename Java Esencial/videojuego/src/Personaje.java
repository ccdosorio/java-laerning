public class Personaje {
    protected int puntosDeVida = 100;
    protected int posicionX = 0;
    protected int posicionUY = 0;

    public Personaje(int posicionX, int posicionUY) {
        this.posicionX = posicionX;
        this.posicionUY = posicionUY;
    }

    public void recibirDano(int puntos) {
        puntosDeVida -= puntos;
    }

    public void moverALaDerecha(int unidades) {
        posicionX += unidades;
    }

    public void moverALaIzquierda(int unidades) {
        posicionUY += unidades;
    }

    public void emitirSonidoDeDolor() {
        System.out.println("Ay!");
    }
}
