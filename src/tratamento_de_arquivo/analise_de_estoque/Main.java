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
            int numLinha = 1;

            while (scan.hasNextLine()){
                String linha = scan.nextLine();
                String[] partes = linha.split(",");


                String codigo = partes[0];
                String nome = partes[1];
                double preco = 1;
                double quantidade = 1;

                try {
                    if (!partes[2].equals("Preco"))
                        preco = Double.parseDouble(partes[2]);
                    if (!partes[3].equals("Quantidade"))
                        quantidade = Integer.parseInt(partes[3]);
                }catch (NumberFormatException e){
                    continue;
                }
                Produto produto = new Produto(codigo, nome, preco, quantidade);
                produtos.add(produto);
                numLinha++;
            }
            scan.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        ArrayList<Produto> emFalta = new ArrayList<>();
        Collections.sort(produtos);
        if (!produtos.isEmpty()){
            produtos.remove(0);
            for (int i = 0; i < 10; i++){
                emFalta.add(produtos.get(i));
            }
            System.out.println("\nVendedor, os seguintes itens estão em falta:");
            for (Produto p : emFalta){
                System.out.println(p.getNome());
            }

        }
    }
}
