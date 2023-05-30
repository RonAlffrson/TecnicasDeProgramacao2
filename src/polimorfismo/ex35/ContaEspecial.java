package polimorfismo.ex35;

public class ContaEspecial extends ContaComum{
    public double limite;
    public ContaEspecial(int num, double saldo, double limite) {
        super(num, saldo);
        this.limite = limite;
    }

    public double sacar(double saque){
        if (saque < limite)
            return saldo - saque;
        return saldo;
    }

}
