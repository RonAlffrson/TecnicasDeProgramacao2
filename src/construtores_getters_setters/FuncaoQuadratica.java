package construtores_getters_setters;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class FuncaoQuadratica {
    private double a;
    public double b,c;
    public FuncaoQuadratica(double a, double b, double c) {
        if (a != 0) this.setA(a);
        this.b = b;
        this.c = c;
    }
    public double Raiz1(){
        double alfa, beta, gama;
        alfa = pow(b, 2);
        beta = 4 * a * c;
        gama = sqrt(alfa - beta);
        return (-b + gama) / (2 * a);
    }
    public double Raiz2(){
        double alfa, beta, gama;
        alfa = pow(b, 2);
        beta = 4 * a * c;
        gama = sqrt(alfa - beta);
        return (-b - gama) / (2 * a);
    }
    public double XVertice(){
        return -b / (2 * a);
    }
    public double YVertice(){
        double alfa, beta;
        alfa = pow(b, 2);
        beta = 4 * a * c;
        return -(alfa - beta) / (4 * a);
    }
    public String Concavidade(){
        if (a < 0) return "para baixo";
        else if (a > 0) return "para cima";
        else return "error";
    }
    public String Descricao(){
        return "y=" + a + "x^2 + " + b + "x + " + c;
    }
    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a != 0) this.a = a;
    }
}
