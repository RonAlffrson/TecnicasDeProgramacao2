package polimorfismo.ex35;

public class ContaPoupanca extends ContaComum{
    public ContaPoupanca(int num, double saldo) {
        super(num, saldo);
    }

    public double render(double taxaRendimento){
        return saldo = saldo * taxaRendimento;
    }
}
