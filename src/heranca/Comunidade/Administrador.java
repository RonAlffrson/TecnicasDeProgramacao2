package heranca.Comunidade;

public class Administrador extends CorpoDocente{
    public boolean chefeSetor, estagiario, deTi;


    public Administrador(String nome, int idade, int anoIngresso, double remuneracao, double hrsDeTrabalho,
                         String cargo, int qntEmpregos, int anosExp, String escolaridade,
                         boolean chefeSetor, boolean estagiario, boolean deTi) {
        super(nome, idade, anoIngresso, remuneracao, hrsDeTrabalho, cargo, qntEmpregos, anosExp, escolaridade);
        this.chefeSetor = chefeSetor;
        this.estagiario = estagiario;
        this.deTi = deTi;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: " + nome + " idade: " + idade + " ano de ingresso: " + anoIngresso +
                " cargo: " + cargo + " remuneração: R$" + remuneracao + " horas de trabalho diárias: " + hrsDeTrabalho + "h" +
                " quantidade de empregos: " + qntEmpregos + " anos de experiência: " + anosExp + " escolaridade: " + escolaridade +
                " chefe de setor: " + chefeSetor + " estagiário: " + estagiario + " de TI: " + deTi);
    }
}
