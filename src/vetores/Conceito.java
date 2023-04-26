package vetores;

import java.util.Scanner;

public enum Conceito {
    PESSIMO(0, 2.9, "Péssimo!"),
    RUIM(3.0, 4.9, "Ruim"),
    REGULAR(5.0, 6.9, "Regular"),
    BOM(7.0, 8.9, "Bom") ,
    MUITO_BOM(9.0, 10.0, "Muito bom!");

    private final double notaMin;
    private final double notaMax;
    private final String descricao;

    private Conceito(double notaMin, double notaMax, String descricao) {
        this.notaMin = notaMin;
        this.notaMax = notaMax;
        this.descricao = descricao;
    }

    public double getNotaMin() {
        return notaMin;
    }

    public double getNotaMax() {
        return notaMax;
    }
    @Override
    public String toString(){
        return descricao;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double notaAluno = scanner.nextDouble();
        Conceito conceitoAluno = Conceito.REGULAR;

        for (Conceito conceito : Conceito.values()){
            if (notaAluno >= conceito.getNotaMin() && notaAluno <= conceito.getNotaMax()){
                conceitoAluno = conceito;
            }
        }
        System.out.println(conceitoAluno);
    }
}
