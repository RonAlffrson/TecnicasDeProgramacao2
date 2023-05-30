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
}
