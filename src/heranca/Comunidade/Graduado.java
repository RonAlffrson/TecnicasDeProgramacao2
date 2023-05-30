package heranca.Comunidade;

public class Graduado extends MembroDaComunidade{
    private int anoEgresso;
    private String curso;
    boolean trabalha;

    public Graduado(String nome, int idade, int anoIngresso, int anoEgresso, String curso, boolean trabalha) {
        super(nome, idade, anoIngresso);
        setAnoEgresso(anoEgresso);
        setCurso(curso);
        this.trabalha = trabalha;
    }

    public int getAnoEgresso() {
        return anoEgresso;
    }

    public void setAnoEgresso(int anoEgresso) {
        if (anoEgresso > 0) this.anoEgresso = anoEgresso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        if (!curso.isEmpty()) this.curso = curso;
    }
}
