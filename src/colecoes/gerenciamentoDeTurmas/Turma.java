package colecoes.gerenciamentoDeTurmas;

import java.util.*;

public class Turma {
    public String nome;
    public ArrayList<Aluno> listaAlunos = new ArrayList<>();

    public Turma(String nome){
        this.nome = nome.trim();
        //this.listaAlunos = listaAlunos;
    }

    public void adicionar_aluno(Aluno aluno){
        listaAlunos.add(aluno);
    }

    public void exibir_alunos(){
            for (Aluno aluno : listaAlunos){
                aluno.exibir_informacoes();
            }
    }
}
