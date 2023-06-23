package tratamento_de_excecoes.operacao_matematica.op_unarias;

public class RaizQuadrada extends OperacaoUnaria {
    public RaizQuadrada(double operando){
        setOperando(operando);
    }

    public void setOperando(double operando){
        if (operando >= 0){
            this.operando = operando;
        }
        else if (operando < 0){
            throw new IllegalArgumentException("Operando deve ser maior ou igual que 0");
        }

    }

    @Override
    public double calcular() {
        return Math.sqrt(operando);
    }
}
