package exercicios_extras;

public final class PasseioCavalo extends Atividade implements Seguranca{
    private int idCavalo;

    public PasseioCavalo(String horario, String quarto, String instrutor, double duracaoEstimada, double duracaoTot, int idCavalo){
        super(horario, quarto, instrutor, duracaoEstimada, duracaoTot);
        setIdCavalo(idCavalo);
        if (this.duracaoTot > this.duracaoEstimada) taxaExt = 60;
    }

    public int getIdCavalo() {
        return idCavalo;
    }

    public void setIdCavalo(int idCavalo) {
        if (idCavalo > 0)
            this.idCavalo = idCavalo;
    }

    @Override
    public String equipamentoSeguranca() {
        return "Capacete";
    }
}
