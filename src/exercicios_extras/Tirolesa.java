package exercicios_extras;

public final class Tirolesa extends Atividade implements Seguranca{
    private String tipo;

    public Tirolesa(String horario, String quarto, String instrutor, double duracaoEstimada, double duracaoTot, String tipo){
        super(horario, quarto, instrutor, duracaoEstimada, duracaoTot);
        setTipo(tipo);
        if (this.duracaoTot > this.duracaoEstimada) taxaExt = 50;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
       if (!(tipo.isEmpty()) && (tipo.equalsIgnoreCase("Montanha") || tipo.equalsIgnoreCase("Largo")))
            this.tipo = tipo;
       else
           throw new IllegalArgumentException("Erro: tipo deve ser 'Montanha' ou 'Largo'");
    }

    @Override
    public String equipamentoSeguranca() {
        if (tipo.equalsIgnoreCase("montanha"))
            return "Capacete";
        else
            return "";
    }
}
