package tratamento_de_excecoes.operacao_matematica;

public class DivisionByZeroException extends IllegalArgumentException{
    public DivisionByZeroException(String str){
        super(str);
    }
}
