package polimorfismo.ex34;

public class Estagiario extends Funcionario {

    public Estagiario(String nome, double salBruto) {
        super(nome, salBruto);
    }


    public double salarioLiquido(){
           return salBruto;
    }

}
