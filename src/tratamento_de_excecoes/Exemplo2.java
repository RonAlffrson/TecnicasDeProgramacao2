package tratamento_de_excecoes;
import java.util.*;

public class Exemplo2 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner t = new Scanner(System.in);
        boolean error;
        do {
            try {
                error = false;
                a = t.nextInt();
                b = t.nextInt();
                c = a / b;

                System.out.printf("%d / %d = %d\n", a, b, c);
            } catch (InputMismatchException e) {
                System.out.print("Entrada inválida\n");
                error = true;
                t.nextLine();
            } catch (ArithmeticException e) {
                System.out.printf("Erro: %s\n", e.getMessage());
                error = true;
                t.nextLine();
            } catch (Exception e) {
                System.out.println("Erro!");
                error = true;
                t.nextLine();
            }
        } while (error);
    }
}
