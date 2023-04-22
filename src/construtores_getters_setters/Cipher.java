import java.util.Scanner;

public class Cipher {
    Scanner scanner = new Scanner(System.in);

    String encrypt() {
        StringBuilder encrypted = new StringBuilder();
        System.out.println("Type the word you want to encrypt: ");
        String original = scanner.next();
        for (char c : original.trim().toCharArray()) {
            encrypted.append((char) ((int) c + 3));
        }
        return encrypted.toString();
    }
    String decrypt(){
        StringBuilder decrypted = new StringBuilder();
        System.out.println("Type the word you want to encrypt: ");
        String original = scanner.next();
        for (char c : original.trim().toCharArray()) {
            decrypted.append((char) ((int) c - 3));
        }
        return decrypted.toString();


    }
}



