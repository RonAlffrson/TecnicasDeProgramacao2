package exerciciosInterface;


public class Product implements Comparable{
    private int id = 1, itensQnt = 0;
    private String productName = "";
    private double price = 0;

    public Product(int id, int itensQnt, String productName, double price) {
        if (id >= 1 && id <= 1999) this.setId(id);
        if (itensQnt >= 0) this.setItensQnt(itensQnt) ;
        this.setProductName(productName);
        if (price >= 0) this.setPrice(price);
    }
    @Override
    public double compareTo(Object obj){
        if (!(obj instanceof Product p)) throw new UnsupportedOperationException("Product can only be compared to product");
        return Double.compare(price, p.price);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getItensQnt() {
        return itensQnt;
    }

    public void setItensQnt(int itensQnt) {
        this.itensQnt = itensQnt;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}