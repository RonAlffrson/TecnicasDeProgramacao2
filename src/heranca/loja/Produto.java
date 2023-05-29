package heranca.loja;

public class Produto {
    protected int id;
    protected String description;
    protected double value, weight;
    private double deliver;

    public Produto(int id, String description, double value, double weight) {
        this.setId(id);
        this.setDescription(description);
        this.setValue(value);
        this.setWeight(weight);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id >= 0) this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (!description.isEmpty())this.description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        if (value > 0) this.value = value;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
            deliver = weight * 6.5;
        }
    }

    public double getDeliver() {
        return deliver;
    }

}
