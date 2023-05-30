package heranca.Comunidade;

public class Funcionario extends Empregado{
    private String setor, campus;
    boolean chefeSetor;

    public Funcionario(String nome, int idade, int anoIngresso, double remuneracao, double hrsDeTrabalho,
                       String cargo, String setor, String campus, boolean chefeSetor) {
        super(nome, idade, anoIngresso, remuneracao, hrsDeTrabalho, cargo);
        setSetor(setor);
        setCampus(campus);
        this.chefeSetor = chefeSetor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        if (!setor.isEmpty())this.setor = setor;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        if(!campus.isEmpty())this.campus = campus;
    }
}
