package recursividade;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("F(n) = " + Fibonacci.acharNumero(num));

    }
    public static int acharNumero(int n){
        if (n == 0){
            return 0;
        }
        else{
            int a = acharNumero(n - 1);
            //aux = n;
            int b = acharNumero(n - 2);
            return a + b;
        }
    }

}
