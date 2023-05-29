package heranca.loja;

import heranca.loja.Produto;

public class Software extends Produto {
    private String category;
    public Software(int id, String description, double value, double weight, String category) {
        super(id, description, value, weight);
        this.setCategory(category);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (!category.isEmpty())this.category = category;
    }
}
