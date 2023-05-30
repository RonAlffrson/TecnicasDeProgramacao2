package heranca.Comunidade;

public class Professor extends CorpoDocente{
    private String graduacao, doutorado;
    int qntAulasSemanais;

    public Professor(String nome, int idade, int anoIngresso, double remuneracao,
                     double hrsDeTrabalho, String cargo, int qntEmpregos, int anosExp, String escolaridade,
                     String graduacao, String doutorado, int qntAulasSemanais) {
        super(nome, idade, anoIngresso, remuneracao, hrsDeTrabalho, cargo, qntEmpregos, anosExp, escolaridade);
        setGraduacao(graduacao);
        setDoutorado(doutorado);
        this.qntAulasSemanais = qntAulasSemanais;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        if(!graduacao.isEmpty()) this.graduacao = graduacao;
    }

    public String getDoutorado() {
        return doutorado;
    }

    public void setDoutorado(String doutorado) {
        if(!doutorado.isEmpty()) this.doutorado = doutorado;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: " + nome + " idade: " + idade + " ano de ingresso: " + anoIngresso +
                " cargo: " + cargo + " remuneração: R$" + remuneracao + " horas de trabalho diárias: " + hrsDeTrabalho + "h" +
                " quantidade de empregos: " + qntEmpregos + " anos de experiência: " + anosExp + " escolaridade: " + escolaridade +
                " graduação: " + graduacao + " doutorado: " + doutorado + " quantidade de aulas semanais: " + qntAulasSemanais);
    }
}
