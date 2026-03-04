package practica;

public class cronometro {

    private long inicia;
    private long finaliza;

    public cronometro() {
        inicia = System.currentTimeMillis();
    }

    public void inicia() {
        inicia = System.currentTimeMillis();
    }

    public void detener() {
        finaliza = System.currentTimeMillis();
    }

    public long lapsoDeTiempo() {
        return finaliza - inicia;
    }

    public long getInicia() {
        return inicia;
    }

    public long getFinaliza() {
        return finaliza;
    }
}