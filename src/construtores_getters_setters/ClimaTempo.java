package construtores_getters_setters;

public class ClimaTempo {
    private double[] Pluviosidade;
    private double[] Pressao;
    public boolean SetPluviosidade(double[] pl) {
        this.Pluviosidade = pl;
        return true;
    }

    public ClimaTempo(double[] pluviosidade, double[] pressao) {
        Pluviosidade = pluviosidade;
        Pressao = pressao;
    }

    public boolean SetPressao(double[] pr) {
        this.Pressao = pr;
        return true;
    }
    public double CalcularMediaPluvial() {
        double media = 0;
        for (double i : Pluviosidade){
            media += Pluviosidade[(int) i];
            media = media / Pluviosidade.length;
        }
        return media;
    }
    public double CalcularMaximaPluvial() {
        double maximaPluvial = Pluviosidade[0];
        for (double i : Pluviosidade){
            if (Pluviosidade[(int) i] > maximaPluvial){
                maximaPluvial = Pluviosidade[(int) i];
            }
        }
        return maximaPluvial;
    }
    public double CalcularPressaoMinima() {
        double pressaoMinima = Pressao[0];
        for (int i = 1; i < 7; i ++){
            if (Pressao[i] < pressaoMinima){
                pressaoMinima = Pressao[i];
            }
        }
        return pressaoMinima;
    }
}
