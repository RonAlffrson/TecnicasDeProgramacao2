package heranca.Comunidade;

public class Aluno extends MembroDaComunidade{
    private String curso;
    private int periodo;
    boolean estagiando;

    public Aluno(String nome, int idade, int anoIngresso, String curso, int periodo, boolean estagiando) {
        super(nome, idade, anoIngresso);
        setCurso(curso);
        setPeriodo(periodo);
        this.estagiando = estagiando;
    }


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        if(!curso.isEmpty())this.curso = curso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        if(periodo > 0) this.periodo = periodo;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: " + nome + " idade: " + idade + " ano de ingresso: " + anoIngresso +
                " curso: " + curso + " período: " + periodo + " estagiando: " + estagiando);
    }
}
