package heranca.juros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Calcular juros simples - 1");
        System.out.println("Calcular juros compostos - 2");
        int escolha = scan.nextInt();

        System.out.print("Capital: ");
        double capital = scan.nextDouble();
        scan.nextLine();
        System.out.print("Taxa (em %): ");
        double taxa = scan.nextDouble();
        scan.nextLine();
        System.out.print("Tempo (em meses): ");
        int tempo = scan.nextInt();
        scan.nextLine();

        JurosCompostos jurosCompostos;
        JurosSimples jurosSimples;

        switch (escolha){
            case 1:
                jurosSimples = new JurosSimples(capital,taxa,tempo);
                jurosSimples.calcularJuros();
                jurosSimples.imprimirDados();
            case 2:
                jurosCompostos = new JurosCompostos(capital,taxa,tempo);
                jurosCompostos.calcularJuros();
                jurosCompostos.imprimirDados();
        }

    }

}
