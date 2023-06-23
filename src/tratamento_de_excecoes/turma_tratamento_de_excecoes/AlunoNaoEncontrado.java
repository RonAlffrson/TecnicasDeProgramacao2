package tratamento_de_excecoes.turma_tratamento_de_excecoes;

public class AlunoNaoEncontrado extends RuntimeException{
    public AlunoNaoEncontrado(String s){
        super(s);
    }
}
