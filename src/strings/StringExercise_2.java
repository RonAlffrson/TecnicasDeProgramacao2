package strings;

import java.util.Scanner;

public class StringExercise_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String vogais = "aeiouAEIOU";
        int contador = 0;
        for(int i = 0; i < vogais.length();i++){
            if(str1.contains(String.valueOf(vogais.charAt(i)))) contador++;
        }
        StringBuilder copiaStr1 = new StringBuilder();
        for (int i = 0; i < str1.length(); i++){
            if (!vogais.contains(String.valueOf(str1.charAt(i)))) copiaStr1.append(str1.charAt(i));
        }
        System.out.println(copiaStr1);
        System.out.println("Insira str2:");
        String str2 = scan.nextLine();
        StringBuilder str1_2 = new StringBuilder();
        for (int i = 0; i < str1.length(); i++){
            if (str2.contains(String.valueOf(str1.charAt(i)))) str1_2.append(str1.charAt(i));
        }
        System.out.println(str1_2);
        StringBuilder str4 = new StringBuilder();
        for (int i = 0; i < vogais.length(); i++){
            if (str1.contains(String.valueOf(vogais.charAt(i)))) str4.append(vogais.charAt(i));
        }
        System.out.println(str4);
    }
}
