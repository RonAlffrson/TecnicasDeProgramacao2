package heranca.Comunidade;

public class CorpoDocente extends Empregado {
    protected int qntEmpregos, anosExp;
    protected String escolaridade;

    public CorpoDocente(String nome, int idade, int anoIngresso, double remuneracao, double hrsDeTrabalho,
                        String cargo, int qntEmpregos, int anosExp, String escolaridade) {
        super(nome, idade, anoIngresso, remuneracao, hrsDeTrabalho, cargo);
        setQntEmpregos(qntEmpregos);
        setEscolaridade(escolaridade);
        this.anosExp = anosExp;
    }

    public int getQntEmpregos() {
        return qntEmpregos;
    }

    public void setQntEmpregos(int qntEmpregos) {
        if (qntEmpregos > 0)this.qntEmpregos = qntEmpregos;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        if (!escolaridade.isEmpty())this.escolaridade = escolaridade;
    }
}
