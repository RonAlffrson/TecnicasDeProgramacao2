package heranca.example;

public class Ponto {
    private double x = 0;
    private double y = 0;

    public Ponto(double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    public Ponto() {

    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
