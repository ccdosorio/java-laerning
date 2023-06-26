public class SaludadorRunnable implements Runnable {

    private int periodoDeSaludo;

    public SaludadorRunnable(int milisegundos) {
        periodoDeSaludo = milisegundos;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(periodoDeSaludo);
            } catch (InterruptedException e) {
                System.out.println("Hilo: " + Thread.currentThread().getName() + " termina su ejecucion");
                throw new RuntimeException(e);
            }
            System.out.println("Hola me llamo " + Thread.currentThread().getName());
        }
    }
}
