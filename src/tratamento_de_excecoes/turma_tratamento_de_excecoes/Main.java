package tratamento_de_excecoes.turma_tratamento_de_excecoes;


public class Main {
    public static void main(String[] args) {
        Turma turma = new Turma();
        turma.listaAlunos.add(new Aluno("renan", 1));
        turma.listaAlunos.add(new Aluno("miguek", 2));
        turma.listaAlunos.add(new Aluno("fernando", 3));
        turma.procurarAluno(new Aluno("renan", 1));
        //turma.procurarAluno(new Aluno("L", 111));
    }
}
