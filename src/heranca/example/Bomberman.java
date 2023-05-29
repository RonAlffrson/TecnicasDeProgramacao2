package heranca.example;

public class Bomberman {
    private int vida = 10;
    private int velocidade = 5;
    private String cor = "branco";
    protected Ponto ponto = new Ponto();

    public Bomberman(int vida, int velocidade, String cor, double x, double y) {
        setVida(vida);
        setVelocidade(velocidade);
        setCor(cor);
        ponto.setX(x);
        ponto.setY(y);
    }
    public String colocarBomba(){
        return "Colocando bomba na posição " + this.ponto.getX() + ", " + this.ponto.getY();
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Ponto getPonto() {
        return ponto;
    }

    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }
}


