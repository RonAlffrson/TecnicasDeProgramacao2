package recursividade;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(num + "!: " + Fatorial.calcularFatorial(num));
    }
    public static int calcularFatorial(int n){
        if (n == 1)
            return 1;
        else
            return calcularFatorial(n - 1) * n;
    }
}
