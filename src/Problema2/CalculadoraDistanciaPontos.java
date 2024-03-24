package Problema2;
import java.util.ArrayList;
import java.util.Scanner;


public class CalculadoraDistanciaPontos {

    static double distanciaDePontos(double x1, double y1, double x2, double y2) {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public static void main(String[] args) {
        ArrayList<Double> coordenadasX = new ArrayList<>();
        ArrayList<Double> coordenadasY = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de pontos: ");
        int numPontos = scanner.nextInt();
        for (int i = 0; i < numPontos; i++) {
            System.out.println("Digite as coordenadas x e y do ponto " + (i + 1) + ":");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            coordenadasX.add(x);
            coordenadasY.add(y);
        }

        System.out.println("Distâncias entre pontos consecutivos:");
        for (int i = 0; i < numPontos - 1; i++) {
            double x1 = coordenadasX.get(i);
            double y1 = coordenadasY.get(i);
            double x2 = coordenadasX.get(i + 1);
            double y2 = coordenadasY.get(i + 1);
            double distancia = distanciaDePontos(x1, y1, x2, y2);
            System.out.println("Distância entre ponto " + (i + 1) + " e ponto " + (i + 2) + ": " + distancia);
        }
    }
}
