package Problema7;

import java.awt.Point;
import java.util.ArrayList;

public class CannonballExemplo {
    public static void main(String[] args) {

        Cannonball cannonball = new Cannonball(20, 5);

        double alpha = 20;
        double v = 10;
        double deltaSec = 0.10;


        ArrayList<Point> posicao = cannonball.shoot(alpha, v, deltaSec);


        System.out.println("Localizações da bala do canhão são precisamente aqui:");
        for (Point posicaoAtual : posicao) {
            System.out.println("x: " + posicaoAtual.getX() + ", y: " + posicaoAtual.getY());
        }
    }
}


