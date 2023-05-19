package colecoes.gerenciamentoDeTurmas;

public class Main {
    public static void main(String[] args) {
        Turma turmaA = new Turma("Turma A");
        Aluno aluno1 = new Aluno("Joao", 15);
        Aluno aluno2 = new Aluno("Maria", 16);

        turmaA.adicionar_aluno(aluno1);
        turmaA.adicionar_aluno(aluno2);

        turmaA.exibir_alunos();
    }
}
