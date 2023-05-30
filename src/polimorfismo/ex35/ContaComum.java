package polimorfismo.ex35;

public class ContaComum {
    protected int num;
    public double saldo;


    public ContaComum(int num, double saldo) {
        setNum(num);
        this.saldo = saldo;
    }

    public double depositar(double deposito){
        if (deposito > 0)
            return deposito + saldo;
        return saldo;
    }

    public double sacar(double saque){
        if (saldo > saque)
            return saldo - saque;
        return saldo;
    }

    public void consultarSaldo(){
        System.out.println("Saldo: R$" + saldo);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        if (num > 0) this.num = num;
    }
}
