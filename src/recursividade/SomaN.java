package recursividade;

import java.util.Scanner;

public class SomaN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println("soma: " + SomaN.somar(num));
    }
    public static int somar(int n){
        if (n == 1)
            return 1;
        else
            return somar(n - 1) + n;
    }
}
