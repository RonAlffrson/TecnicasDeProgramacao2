package vetores_tipoEnumerado;

import java.util.Scanner;

public class MainExercise24 {
    public static void main(String[] args) {
        //24----------------------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the number n: ");
        int n = scanner.nextInt();
        int[] v = new int[n];

        System.out.print("type k: ");
        int k = scanner.nextInt();
        System.out.println("Type the numbers inside v:");
        for (int i = 0; i < n; i++){
            v[i] = scanner.nextInt();
        }
        int counter = 0;
        for (int number : v){
            if (number == k){
                counter++;
            }
        }
        if (counter != 0){
            System.out.printf("The number of times 'k' happens in 'v' is: %d\n", counter);
            System.out.println("k postition(s) in v:");
            for (int i = 0; i < n; i++){
                if (v[i] == k){
                    counter++;
                    System.out.println(i);
                }
            }
        }

        else System.out.println("The number was not found");
    }
}
