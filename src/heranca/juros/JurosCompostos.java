package heranca.juros;

public class JurosCompostos extends Juros {
    public JurosCompostos(double capital, double taxa, int tempo) {
        super(capital, taxa, tempo);
    }

    public double calcularJuros(){
        return (getCapital() * Math.pow((1 + getTaxa()), getTempo())) - getCapital();
    }

    public void imprimirDados(){
        System.out.println("juros: " + calcularJuros() + " capital: " + getCapital() + " taxa: " + getTaxa() + " tempo: " + getTempo());
    }
}
