package colecoes.turma;

import java.util.ArrayList;

public class Turma {
    public ArrayList<Aluno> alunos = new ArrayList<>();
    private int codigo;
    public String descricao;

    public Turma(int codigo, String descricao){
        setCodigo(codigo);
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo > 0) this.codigo = codigo;
    }

}
