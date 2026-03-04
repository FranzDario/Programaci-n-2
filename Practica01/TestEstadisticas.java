package practica;

import java.util.Scanner;

public class TestEstadisticas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Ingrese 10 números:");

        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextDouble();
        }

        Estadisticas est = new Estadisticas(numeros);

        System.out.println("Promedio: " + est.promedio());
        System.out.println("Desviación estándar: " + est.desviacion());
    }
}