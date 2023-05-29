package heranca.loja;

public class Book extends Produto {
    private String author;

    public Book(int id, String description, double value, double weight, String author) {
        super(id, description, value, weight);
        this.setAuthor(author);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if(!author.isEmpty()) this.author = author;
    }
}
