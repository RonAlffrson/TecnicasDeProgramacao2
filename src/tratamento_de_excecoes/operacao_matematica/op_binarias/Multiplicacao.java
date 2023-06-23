package tratamento_de_excecoes.operacao_matematica.op_binarias;

public class Multiplicacao extends OperacaoBinaria{
    public Multiplicacao(double operando1, double operando2){
        setOperando1(operando1);
        setOperando2(operando2);
    }
    public void setOperando1(double operando1){
        this.operando1 = operando1;
    }
    public void setOperando2(double operando2){
        this.operando2 = operando2;
    }
    @Override
    public double calcular(){
        return operando1 * operando2;
    }

}
