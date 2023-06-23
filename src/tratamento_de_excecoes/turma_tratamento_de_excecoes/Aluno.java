package tratamento_de_excecoes.turma_tratamento_de_excecoes;

import tratamento_de_excecoes.operacao_matematica.NegativeValueException;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Aluno {
    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula){
        setNome(nome);
        setMatricula(matricula);
    }

@Override
    public boolean equals(Object obj){
        Aluno a = (Aluno) obj;
        if (a.matricula == this.matricula && a.nome.equals(this.nome))
            return true;
        else
            return false;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.isEmpty())
            this.nome = nome;
        else
            throw new IllegalArgumentException("Nome não pode ser vazio");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if (matricula > 0)
            this.matricula = matricula;
        else
            throw new NegativeValueException("Valores devem ser maiores que zero");
    }
}