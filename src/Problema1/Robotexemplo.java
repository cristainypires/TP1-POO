package Problema1;

public class Robotexemplo {
    public static void main(String[] args) {
        Robot robot1 = new Robot(0, 0, Robot.Direcao.NORTE);


        System.out.println("A Localização do robot 1 é " + robot1.getPonto2D().getX() + " no eixo do x e " + robot1.getPonto2D().getY() + " no eixo do y");

        System.out.println("A Direção do robot 1 é: " + robot1.getDirecao());
    }
}

