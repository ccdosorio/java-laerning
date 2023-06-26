public class Contador {
    private int c = 0;

    public synchronized void incrementar() {
        c++;
        for (int i = 0; i < 5; ++) {
            System.out.println("Esperando un segundo desde el hilo " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void decrementar() {
        c--;
    }

    public synchronized int obtenerValor() {
        return c;
    }
}

