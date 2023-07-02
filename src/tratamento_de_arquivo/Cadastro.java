package tratamento_de_arquivo;
import java.io.*;
import java.util.*;
public class Cadastro {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        try (PrintWriter arquivo = new PrintWriter(new FileWriter("pessoas.txt", true))){
            arquivo.println();
            System.out.println("Primeiro nome: ");
            arquivo.print(scan.nextLine() + " ");
            System.out.println("Último nome: ");
            arquivo.print(scan.nextLine() + " ");
            System.out.println("Idade: ");
            arquivo.print(scan.nextInt() + " ");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
