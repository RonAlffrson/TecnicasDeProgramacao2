package heranca.ParqueDeDiversoes;

public class Atracao {
    protected String nome;
    public int capacidade;
    protected double preco;

    public Atracao(String nome, int capacidade, double preco){
        setNome(nome);
        this.capacidade = capacidade;
        setPreco(preco);
    }

    public String getNome(){return nome;}
    public void setNome(String nome){if (!nome.isEmpty()) this.nome = nome;}
    public double getPreco(){return preco;}
    public void setPreco(double preco){if (preco != 0) this.preco = preco;}

    public double arrecadacaoMaxima(){
        return capacidade * preco;
    }
}
