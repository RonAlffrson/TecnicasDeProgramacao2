package tratamento_de_excecoes.operacao_matematica;

public class NegativeValueException extends IllegalArgumentException{
    public NegativeValueException(String str){
        super(str);
    }
}
