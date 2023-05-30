package polimorfismo.ex34;

public class Funcionario {
    protected String nome;
    protected double salBruto;


    public Funcionario(String nome, double salBruto) {
        setNome(nome);
        setSalBruto(salBruto);
    }

    public double descontoIR(){
        if (salBruto <= 900)
            return 0;
        else if (salBruto > 900 && salBruto <= 1500)
            return (double) 15/100;
        else
            return (double) 20/100;
    }

    public double salarioLiquido(){
        return salBruto - (salBruto * descontoIR());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(!nome.isEmpty()) this.nome = nome;
    }

    public double getSalBruto() {
        return salBruto;
    }

    public void setSalBruto(double salBruto) {
        if (salBruto > 0) this.salBruto = salBruto;
    }
}
