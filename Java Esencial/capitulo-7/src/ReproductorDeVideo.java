public class ReproductorDeVideo implements Reproductor {

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo Video");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Video");
    }

    @Override
    public void parar() {
        System.out.println("Parando Video");
    }

    @Override
    public void rebobinar(int segundos) {
        System.out.println("Rebobinando Video " + segundos + " segundos");
    }

    @Override
    public void adelantar(int segundos) {
        System.out.println("Adelantando Video " + segundos + " segundos");
    }
}
