package Problema1;

public class Robot {


    enum Direcao {
        NORTE, ESTE, SUL, OESTE;
    }

    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }

    private Ponto2D localizacao;
    private Direcao direcao;

    public Robot(int x, int y, Direcao direcao) {
        this.localizacao = new Ponto2D(x, y);
        this.direcao = direcao;
    }

    public void virarEsquerda() {
        if (direcao == Direcao.NORTE) {
            direcao = Direcao.OESTE;
        } else if (direcao == Direcao.ESTE) {
            direcao = Direcao.NORTE;
        } else if (direcao == Direcao.SUL) {
            direcao = Direcao.ESTE;
        } else if (direcao == Direcao.OESTE) {
            direcao = Direcao.SUL;
        }
    }

    public void virarDireita() {
        if (direcao == Direcao.NORTE) {
            direcao = Direcao.ESTE;
        } else if (direcao == Direcao.ESTE) {
            direcao = Direcao.SUL;
        } else if (direcao == Direcao.SUL) {
            direcao = Direcao.OESTE;
        } else if (direcao == Direcao.OESTE) {
            direcao = Direcao.NORTE;
        }
    }

    public void mover() {
        if (direcao == Direcao.NORTE) {
            localizacao.setY(localizacao.getY() + 1);
        } else if (direcao == Direcao.ESTE) {
            localizacao.setX(localizacao.getX() + 1);
        } else if (direcao == Direcao.SUL) {
            localizacao.setY(localizacao.getY() - 1);
        } else if (direcao == Direcao.OESTE) {
            localizacao.setX(localizacao.getX() - 1);
        }
    }

    public Ponto2D getPonto2D() {
        return localizacao;
    }

    public String getDirecao() {
        return direcao.toString();
    }

    public class Ponto2D {
        private int x;
        private int y;

        public Ponto2D(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
