package colecoes;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise47 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a sentence:");
        String str = scan.nextLine();
        StringTokenizer strTokenizer = new StringTokenizer(str);
        int wordCounter;
        ArrayList<String> list = new ArrayList<>();
        while (strTokenizer.hasMoreTokens()) {
            list.add(strTokenizer.nextToken());
        }
        System.out.println(list);
        System.out.println("There are "  + list.size() + " words in the sentence");
        for (String string : list){
            wordCounter = 0;
            for (String string2: list){
                if (string.equals(string2)) wordCounter++;
            }
            System.out.println("There are " + wordCounter + " occurrence of the word: " + string + " in the sentence");
        }

    }
}
