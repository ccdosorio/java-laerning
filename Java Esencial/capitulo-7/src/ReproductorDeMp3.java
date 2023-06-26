public class ReproductorDeMp3 implements Reproductor {

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo Audio");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Audio");
    }

    @Override
    public void parar() {
        System.out.println("Parando Audio");
    }

    @Override
    public void rebobinar(int segundos) {
        System.out.println("Rebobinando Audio " + segundos + " segundos");
    }

    @Override
    public void adelantar(int segundos) {
        System.out.println("Adelantando Audio " + segundos + " segundos");
    }
}
