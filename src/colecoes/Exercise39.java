package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise39 {
    public static void main(String[] args) {
        ArrayList<Character> stringChars = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();

        for (int i = 0; i < string.length();i++){
            stringChars.add(string.charAt(i));
        }

        for(char c = 'A'; c <= 'Z'; c++){
            int counter = Collections.frequency(stringChars, c);
            System.out.println(c + "=" + counter);
        }

        for(char c = 'a'; c <= 'z'; c++){
            int counter = Collections.frequency(stringChars, c);
            System.out.println(c + "=" + counter);
        }

    }
}
