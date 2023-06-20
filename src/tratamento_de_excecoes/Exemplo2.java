package tratamento_de_excecoes;
import java.util.*;

public class Exemplo2 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner t = new Scanner(System.in);
        boolean error = false;
        do {
            try {
                a = t.nextInt();
                b = t.nextInt();
                c = a / b;

                System.out.printf("%d / %d = %d\n", a, b, c);
            } catch (InputMismatchException e) {
                System.out.print("Entrada inválida\n");
                error = true;
            } catch (ArithmeticException e) {
                System.out.printf("Erro: %s\n", e.getMessage());
                error = true;
            } catch (Exception e) {
                System.out.println("Erro!");
                error = true;
            }
        } while (error);
    }
}
