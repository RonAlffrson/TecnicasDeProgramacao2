package exerciciosInterface;

public class Livro implements ItemVendivel{
       /* e represente um livro disponível
para venda na livraria, com atributos adicionais, como autor e número de
páginas. Por fim, crie uma classe chamada "Livraria" que utilize a interface
"ItemVendavel" para gerenciar o estoque de livros e realizar operações de
compra e venda.*/
    private String titulo, autor;
    private double preco;
    private int qntEstoque, numPaginas;

    public Livro(String titulo, String autor, int numPaginas, double preco, int qntEstoque){
        setTitulo(titulo);
        setAutor(autor);
        setNumPaginas(numPaginas);
        setPreco(preco);
        setQntEstoque(qntEstoque);
    }

    @Override
    public void alterarTitulo(String titulo) {
        setTitulo(titulo);
    }

    @Override
    public void alterarPreco(double preco) {
        setPreco(preco);
    }

    @Override
    public void alterarQntEstoque(int qntEstoque) {
        setQntEstoque(qntEstoque);
    }
    public void disponibilidade(){
        if (qntEstoque > 0) System.out.println("Item disponível");
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
        if (!autor.isEmpty())this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0)this.preco = preco;
    }

    public int getQntEstoque() {
        return qntEstoque;
    }

    public void setQntEstoque(int qntEstoque) {
        if (qntEstoque >= 0)this.qntEstoque = qntEstoque;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        if (numPaginas > 0) this.numPaginas = numPaginas;
    }
}
