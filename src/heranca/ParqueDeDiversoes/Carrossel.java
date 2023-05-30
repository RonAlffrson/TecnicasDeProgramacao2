package heranca.ParqueDeDiversoes;

public class Carrossel extends Atracao{
    private int idadeMinima;
    public Carrossel(String nome, int capacidade, double preco, int idadeMinima){
        super(nome, capacidade, preco);
        setAlturaMinima(idadeMinima);

    }

    public double getIdadeinima(){
        return idadeMinima;
    }
    public void setAlturaMinima(int idadeMinima){
        if (idadeMinima > 0) this.idadeMinima = idadeMinima;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: " + getNome() + " capacidade: " + capacidade + " preco: " + getPreco() + " idade mínima: " + getIdadeinima());
    }
}
