package heranca.juros;

public class JurosSimples extends Juros {
    public JurosSimples(double capital, double taxa, int tempo) {
        super(capital, taxa, tempo);
    }

    public double calcularJuros(){
        return getCapital() * getTaxa() * getTempo();
    }

    public void imprimirDados(){
        System.out.println("juros: " + calcularJuros() + " capital: " + getCapital() + " taxa: " + getTaxa() + " tempo: " + getTempo());
    }
}
