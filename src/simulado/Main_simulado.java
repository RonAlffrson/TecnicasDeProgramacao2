package simulado;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_simulado {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Livro> lista = new ArrayList<>();

        System.out.println("Informe o Título do Livro: ");
        String titulo = input.nextLine();

        while(!titulo.isEmpty()) {
            System.out.println("Informe o Autor: ");
            String autor = input.nextLine();

            System.out.println("Informe o Ano de Publicação: ");
            int anoPubli = input.nextInt();

            System.out.println("Informe o Preço do Livro: ");
            double preco = input.nextDouble();

            Livro livro = new Livro(titulo, autor, anoPubli, preco);

            lista.add(livro);

            input.nextLine();

            System.out.println("Informe o Título do Livro: ");
            titulo = input.nextLine();
        }

        System.out.println("Informe o nome do Livro: ");
        String inputString = input.nextLine();

        for (Livro livro : lista) {
            if (livro.getTitulo().equals(inputString)) livro.exibirDados();
        }

        Main_simulado.buscarLivro("titulo", lista);
    }
    public static Livro buscarLivro(String titulo, ArrayList<Livro> lista){
        for (Livro livro : lista ){
            if (livro.getTitulo().equals(titulo))
                return livro;
        }
        return null;
    }
}




// Encapsulamento dos atributos em Private, para privar o usuário de acessá-los diretamente. Dando mais segurança e controle sobre o programa.
// Sobre os métodos especiais, criamos os métodos Getters (para printá-los na classe Main) e os métodos Setters (para modificar os valores dos atributos que estão fora da validação).

class Livro {

    private String titulo, autor;
    private int anoPubli;
    private double preco;

    public Livro(String titulo, String autor, int anoPubli, double preco) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setAnoPubli(anoPubli);
        this.setPreco(preco);
    }

    public void exibirDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPubli);
        System.out.println("Preço do Livro: R$" + preco);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (!titulo.isEmpty()) this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (!autor.isEmpty()) this.autor = autor;
    }

    public int getAnoPubli() {
        return anoPubli;
    }

    public void setAnoPubli(int anoPubli) {
        if (anoPubli >= 0) this.anoPubli = anoPubli;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) this.preco = preco;
    }
}