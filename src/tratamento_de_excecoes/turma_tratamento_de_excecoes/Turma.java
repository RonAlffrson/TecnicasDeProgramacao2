package tratamento_de_excecoes.turma_tratamento_de_excecoes;

import java.util.ArrayList;

public class Turma {
    public ArrayList<Aluno> listaAlunos = new ArrayList<>();

    public void procurarAluno(Aluno aluno){
        if (listaAlunos.contains(aluno))
            System.out.println("Aluno existe");
        else
            throw new AlunoNaoEncontrado("Aluno não está na listagem");
    }
}
