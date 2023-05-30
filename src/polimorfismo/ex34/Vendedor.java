package polimorfismo.ex34;

import polimorfismo.ex34.Funcionario;

public class Vendedor extends Funcionario {
    public double bonus;
    public Vendedor(String nome, double salBruto) {
        super(nome, salBruto);
    }

    public double descontoIR(){
        if (salBruto + bonus <= 900)
            return 0;
        else if (salBruto + bonus > 900 && salBruto + bonus <= 1500)
            return (double) 15/100;
        else
            return (double) 20/100;

    }
    public double salarioLiquido(){
        return salBruto - (salBruto * descontoIR());
    }
}
