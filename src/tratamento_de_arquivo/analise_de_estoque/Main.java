package tratamento_de_arquivo.analise_de_estoque;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Produto> produtos = new ArrayList<>();

        try{
            FileReader in = new FileReader("C:\\Users\\renan\\IdeaProjects\\tp2\\src\\tratamento_de_arquivo\\analise_de_estoque\\items.csv");
            Scanner scan = new Scanner(in);
            while (scan.hasNextLine()){
                String linha = scan.nextLine();
                String[] partes = linha.split(",");
                //linha.split(",");


                String codigo = partes[0];
                String nome = partes[1];
                String preco = partes[2];
                String quantidade = partes[3];

                Produto produto = new Produto(codigo, nome, preco, quantidade);
                produtos.add(produto);
            }
            scan.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        ArrayList<Produto> emFalta = new ArrayList<>();
        Collections.sort(produtos);
        //System.out.println(produtos);
        for (int i = 0; i < 10; i++){
            emFalta.add(produtos.get(i));
        }
        System.out.println("\nVendedor, os seguintes itens estão em falta:");
        System.out.println(emFalta);
        for (Produto p : emFalta){
            System.out.println(p.getNome());
        }
    }
}
