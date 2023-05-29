package heranca.loja;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the id, description, value, weight and artist of the cd:");
        int id = scan.nextInt();
        scan.nextLine();
        String description = scan.nextLine();
        double value = scan.nextDouble();
        double weight = scan.nextDouble();
        scan.nextLine();
        String artist = scan.nextLine();
        Cd cd = new Cd(id,description,value,weight,artist);
        System.out.println(cd.id + " " + cd.description + " " + cd.value + " " + cd.weight + " " + cd.getArtist() + " " + cd.getDeliver());

        System.out.println("Type the id, description, value, weight and author of the book:");
        id = scan.nextInt();
        scan.nextLine();
        description = scan.nextLine();
        value = scan.nextDouble();
        weight = scan.nextDouble();
        scan.nextLine();
        String author = scan.nextLine();
        Book book = new Book(id,description,value,weight,author);
        System.out.println(book.id + " " + book.description + " " + book.value + " " + book.weight + " " + book.getAuthor() + " " + book.getDeliver());

        System.out.println("Type the id, description, value, weight and category of the software:");
        id = scan.nextInt();
        scan.nextLine();
        description = scan.nextLine();
        value = scan.nextDouble();
        weight = scan.nextDouble();
        scan.nextLine();
        String category = scan.nextLine();
        Software software = new Software(id,description,value,weight,category);
        System.out.println(software.id + " " + software.description + " " + software.value + " " + software.weight + " " + software.getCategory() + " " + software.getDeliver());
    }
}
