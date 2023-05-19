package colecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class NewExercise38 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        System.out.println("insira uma string");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        while(!str.isEmpty()){
            if (!lista.contains(str)) lista.add(str);
            System.out.println("insira uma string:");
            str = scan.nextLine();
        }
        for(String string : lista){
            System.out.println(string);
        }
    }
}
