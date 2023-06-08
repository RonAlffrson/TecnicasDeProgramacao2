package polimorfismo.ex35;

public class ContaEspecial extends ContaComum{
    private double limite;
    public ContaEspecial(int num, double saldo, double limite) {
        super(num, saldo);
        setLimite(limite);
    }

    public double sacar(double saque){
        if (saque < limite)
            return saldo - saque;
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
       if (limite > 0) this.limite = limite;
    }
}
