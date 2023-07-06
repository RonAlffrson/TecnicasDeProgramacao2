package exercicios_extras;

public class Atividade{
    protected String horario, quarto, instrutor;
    protected double duracaoEstimada, duracaoTot;
    public int taxaExt;

    public Atividade(String horario, String quarto, String instrutor, double duracaoEstimada, double duracaoTot){
        setHorario(horario);
        setQuarto(quarto);
        setInstrutor(instrutor);
        setDuracaoEstimada(duracaoEstimada);
        setDuracaoTot(duracaoTot);
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        if (!(horario.isEmpty()))
            this.horario = horario;
        else
            throw new IllegalArgumentException("Erro: horário não pode ser vazio");
    }

    public String getQuarto() {
        return quarto;
    }

    public void setQuarto(String quarto) {
        if (!(quarto.isEmpty()))
            this.quarto = quarto;
        else
            throw new IllegalArgumentException("Erro: quarto não pode ser vazio");
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        if (!(instrutor.isEmpty()))
            this.instrutor = instrutor;
        else
            throw new IllegalArgumentException("Erro: instrutor não pode ser vazio");
    }

    public double getDuracaoEstimada() {
        return duracaoEstimada;
    }

    public void setDuracaoEstimada(double duracaoEstimada) {
        if (duracaoEstimada > 0)
            this.duracaoEstimada = duracaoEstimada;
        else
            throw new IllegalArgumentException("Erro: duração estimada deve ser maior que zero");
    }

    public double getDuracaoTot() {
        return duracaoTot;
    }

    public void setDuracaoTot(double duracaoTot) {
        if (duracaoTot > 0)
            this.duracaoTot = duracaoTot;
        else
            throw new IllegalArgumentException("Erro: duração estimada deve ser maior que zero");
    }
}
