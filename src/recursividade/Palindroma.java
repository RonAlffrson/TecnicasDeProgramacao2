package recursividade;

import java.util.Scanner;

public class Palindroma {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(Palindroma.ehPalindroma(str));
    }
    public static boolean ehPalindroma(String str){
        StringBuilder str2 = new StringBuilder(str);
        return str.equals(str2.reverse().toString());
    }
}
