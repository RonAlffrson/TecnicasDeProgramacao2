package tratamento_de_excecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class LeitorInteiros {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int num = 0;
        boolean error;

        do {
            do {
                try{
                    error = false;
                    System.out.println("insira um num: ");
                    num = scan.nextInt();
                }
                catch (Exception e){
                    System.out.println("Erro: " + e.getMessage());
                    error = true;
                    scan.nextLine();
                }
            }while (error);

            list.add(num);
        }while (num > 0);
        System.out.println(list);

        list.remove(list.size()-1);

        int soma = 0;
        for (Integer i : list){
            soma += i;
        }
        System.out.println("O somatório dos números é: " + soma);
    }
}
