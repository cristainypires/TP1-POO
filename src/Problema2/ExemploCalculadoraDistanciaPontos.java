package Problema2;
import java.util.ArrayList;

public class ExemploCalculadoraDistanciaPontos {
    public static void main(String[] args) {
        ArrayList<Double> coordenadasX = new ArrayList<>();
        ArrayList<Double> coordenadasY = new ArrayList<>();
        coordenadasX.add(0.0);
        coordenadasY.add(0.0);
        coordenadasX.add(1.0);
        coordenadasY.add(1.0);
        coordenadasX.add(1.0);
        coordenadasY.add(10.0);


        for (int i = 0; i < coordenadasX.size() - 1; i++) {
            double x1 = coordenadasX.get(i);
            double y1 = coordenadasY.get(i);
            double x2 = coordenadasX.get(i + 1);
            double y2 = coordenadasY.get(i + 1);
            double distancia = CalculadoraDistanciaPontos.distanciaDePontos(x1, y1, x2, y2);
            System.out.println(" A Distância entre ponto " + (i + 1) + " e ponto " + (i + 2) + ": " + distancia);
        }
    }
}
