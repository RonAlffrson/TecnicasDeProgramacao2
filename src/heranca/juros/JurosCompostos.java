package heranca.juros;

public class JurosCompostos extends Juros {
    public JurosCompostos(double capital, double taxa, int tempo) {
        super(capital, taxa, tempo);
    }

    public double calcularJuros(){
        //todo return getCapital() * getTaxa() * getTempo();
        return 0;
    }

    public void imprimirDados(){
        System.out.println("juros: " + calcularJuros() + "capital: " + getCapital() + "taxa: " + getTaxa() + "tempo: " + getTempo());
    }
}
