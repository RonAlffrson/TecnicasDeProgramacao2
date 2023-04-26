package vetores;

import java.util.Scanner;

public class MainExercise25 {
    public static void main(String[] args) {
        //25-------------------------------------------------------
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the number n: ");
        int n = scanner.nextInt();
        int[] v;
        v = new int[n];
        System.out.print("type k: ");
        int k = scanner.nextInt();
        System.out.println("Type the numbers inside v:");
        for (int i = 0; i < n; i++){
            v[i] = scanner.nextInt();
        }
        System.out.print("type p: ");
        int p = scanner.nextInt();
        if (p > n) System.out.println("Invalid number");
        for (int i = n - 1 ; i > p; i--){
            v[i] = v[i - 1];
        }
        v[p] = k;

        for (int i : v){
            System.out.println(i);
        }


    }
}