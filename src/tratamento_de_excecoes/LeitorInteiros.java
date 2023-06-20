package tratamento_de_excecoes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LeitorInteiros {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int num = 0;
        boolean error = true;


        do {
            System.out.println("insira um num: ");
            do {
                try{
                    num = scan.nextInt();
                    error = false;
                }
                catch (Exception e){
                    System.out.println("Erro: " + e.getMessage());
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
