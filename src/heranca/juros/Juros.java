package heranca.juros;

public class Juros {
    protected double capital, taxa;
    protected int tempo;

    public Juros(double capital, double taxa, int tempo){
        this.setCapital(capital);
        this.setTaxa(taxa);
        this.setTempo(tempo);
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        if (capital > 0)
            this.capital = capital;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        if (taxa > 0 && taxa <= 100) this.taxa = taxa / 100;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        if (tempo >=1 && tempo <= 12) this.tempo = tempo;
    }
}
