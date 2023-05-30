package heranca.Comunidade;

public class Empregado extends MembroDaComunidade{
    protected double remuneracao, hrsDeTrabalho;
    protected String cargo;

    public Empregado(String nome, int idade, int anoIngresso, double remuneracao, double hrsDeTrabalho, String cargo){
        super(nome, idade, anoIngresso);
        setRemuneracao(remuneracao);
        setHrsDeTrabalho(hrsDeTrabalho);
        setCargo(cargo);
    }

    public double getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(double remuneracao) {
        if (remuneracao > 0)this.remuneracao = remuneracao;
    }

    public double getHrsDeTrabalho() {
        return hrsDeTrabalho;
    }

    public void setHrsDeTrabalho(double hrsDeTrabalho) {
        if(hrsDeTrabalho > 0)this.hrsDeTrabalho = hrsDeTrabalho;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if(!cargo.isEmpty())this.cargo = cargo;
    }
}
