package heranca.ParqueDeDiversoes;

public class MontanhaRussa extends Atracao {
    private double alturaMinima;
    public MontanhaRussa(String nome, int capacidade, double preco, double alturaMinima){
        super(nome, capacidade, preco);
        setAlturaMinima(alturaMinima);
    }

    public double getAlturaminima(){
        return alturaMinima;
    }
    public void setAlturaMinima(double alturaMinima){
        if (alturaMinima > 0) this.alturaMinima = alturaMinima;
    }
    public void exibirDetalhes(){
        System.out.println("Nome: " + getNome() + " capacidade: " + capacidade + " preco: R$" + getPreco() + " altura mínima: " + getAlturaminima() +
                " arrecadação máxima: R$" + arrecadacaoMaxima());
    }
}

