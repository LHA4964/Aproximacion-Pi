package mates;
import java.lang.Math.*;

public class Matematicas{
    /**
     * * Genera una aproximación al número Pi mediante el método de
     * * Montecarlo. El parámetro `pasos` indica el número de puntos
     * * generado.
     * */
    public static double generarNumeroPiIterativo(long pasos){
        int i, aciertos;
        float pi, total;
        double x, y, resultado;
        aciertos = 0;
        total = pasos;
        for(i=0;i<=pasos;i++){
            x = Math.random();
            y = Math.random();

            resultado = x*x + y*y;
            if (resultado<=1) {
                aciertos++;
            }
        }
        pi = 4*aciertos/total;
        return pi;
    }
}
