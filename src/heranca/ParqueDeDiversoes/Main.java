package heranca.ParqueDeDiversoes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o nome, capacidade, preco, idade mínima:");
        String nome = scan.nextLine();
        int capacidade = scan.nextInt();
        scan.nextLine();
        double preco = scan.nextDouble();
        scan.nextLine();
        int idadeMin = scan.nextInt();
        scan.nextLine();
        Carrossel carrossel = new Carrossel(nome, capacidade, preco, idadeMin);
        carrossel.exibirDetalhes();

        System.out.print("Insira o nome, capacidade, preco, altura mínima: ");
        nome = scan.nextLine();
        capacidade = scan.nextInt();
        scan.nextLine();
        preco = scan.nextDouble();
        scan.nextLine();
        double alturaMin = scan.nextDouble();
        MontanhaRussa montanhaRussa = new MontanhaRussa(nome, capacidade, preco, alturaMin);
        montanhaRussa.exibirDetalhes();
    }
}
