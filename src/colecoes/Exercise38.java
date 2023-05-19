package colecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise38 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String str;

        do{
            str = scan.nextLine();
            if (!list.contains(str) && !str.equals("")) list.add(str);
            else break;
        }while(true);

        for (int i = list.size() - 1; i >= 0; i--){
            System.out.println(list.get(i));
        }
    }
}
