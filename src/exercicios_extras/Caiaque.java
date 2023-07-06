package exercicios_extras;

public final class Caiaque extends Atividade implements Seguranca{
    private int idCaiaque;

    public Caiaque(String horario, String quarto, String instrutor, double duracaoEstimada, double duracaoTot, int idCaiaque){
        super(horario, quarto, instrutor, duracaoEstimada, duracaoTot);
        setIdCaiaque(idCaiaque);
        if (this.duracaoTot > this.duracaoEstimada) taxaExt = 20;
    }

    public int getIdCaiaque() {
        return idCaiaque;
    }

    public void setIdCaiaque(int idCaiaque) {
        if (idCaiaque > 0)
            this.idCaiaque = idCaiaque;
    }

    @Override
    public String equipamentoSeguranca() {
        return "Colete salva-vidas";
    }
}
