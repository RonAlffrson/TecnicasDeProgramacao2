package construtores_getters_setters;

import java.util.Scanner;

public class Cipher {
    String encrypt(String original) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : original.trim().toCharArray()) {
            encrypted.append((char) ((int) c + 3));
        }
        return encrypted.toString();
    }
    String decrypt(String encrypted){
        StringBuilder decrypted = new StringBuilder();
        for (char c : encrypted.trim().toCharArray()) {
            decrypted.append((char) ((int) c - 3));
        }
        return decrypted.toString();
    }
}
class Main{
    public static void main(String[] args) {
        Cipher cifra = new Cipher();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the word you want to encrypt: ");
        String original = scanner.next();
        System.out.println("Type the word you want to encrypt: ");
        String encrypted = scanner.next();
        System.out.println(cifra.encrypt(original) + " " + cifra.decrypt(encrypted));

    }
}



