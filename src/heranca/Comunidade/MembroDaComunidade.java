package heranca.Comunidade;

public class MembroDaComunidade {
    protected String nome;
    protected int idade, anoIngresso;

    public MembroDaComunidade(String nome, int idade, int anoIngresso) {
        this.nome = nome;
        this.idade = idade;
        this.anoIngresso = anoIngresso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.isEmpty()) this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 18) this.idade = idade;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        if (anoIngresso > 0) this.anoIngresso = anoIngresso;
    }
    public void exibirDetalhes(){
        System.out.println("Nome: " + nome + " idade: " + idade + " ano de ingresso: " + anoIngresso);
    }
}
