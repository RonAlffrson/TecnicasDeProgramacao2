package exercicios_extras;

public class Caminhada extends Atividade{
    private String tipo;
    private String[] tiposCaminhada = {"Fácil", "Moderado", "Exigente"};

    public Caminhada(String horario, String quarto, String instrutor, double duracaoEstimada, double duracaoTot, String tipo) throws NivelDificuldadeException {
        super(horario, quarto, instrutor, duracaoEstimada, duracaoTot);
        setTipo(tipo);
        if (duracaoTot > duracaoEstimada) taxaExt = 10;
    }
    public String getTipo(){return tipo;}
    public void setTipo(String tipo) throws NivelDificuldadeException {
        if (!(tipo.isEmpty()) && (tipo.equalsIgnoreCase("Fácil") ||
                tipo.equalsIgnoreCase("Moderado") ||
                tipo.equalsIgnoreCase("Exigente"))){
            this.tipo = tipo;
        }
        else
            throw new NivelDificuldadeException("Erro: tipo de caminhada só pode ser 'Fácil', 'Moderado' ou 'Exigente'");
    }



}
