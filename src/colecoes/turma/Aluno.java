package colecoes.turma;

public class Aluno implements Comparable<Object> {
    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    @Override
    public int compareTo(Object obj){
        if (!(obj instanceof Aluno)) throw new UnsupportedOperationException("Aluno só pode ser comparado com aluno");
        Aluno a  = (Aluno) obj;
        return Integer.compare(matricula, a.matricula);
    }   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.isEmpty()) this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if (matricula > 0) this.matricula = matricula;
    }


}
