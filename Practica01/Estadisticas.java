package practica;

public class Estadisticas {

    private double[] datos;

    public Estadisticas(double[] datos) {
        this.datos = datos;
    }

    public double promedio() {
        double suma = 0;
        for (double d : datos) {
            suma += d;
        }
        return suma / datos.length;
    }

    public double desviacion() {
        double prom = promedio();
        double suma = 0;

        for (double d : datos) {
            suma += Math.pow(d - prom, 2);
        }

        return Math.sqrt(suma / (datos.length - 1));
    }
}