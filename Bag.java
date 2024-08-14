public class Bag {
    private int id;
    private String name;
    private String category;
    private double price;

    public Bag(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%d: %s (%s) - $%.2f", id, name, category, price);
    }

    public String getCategory() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getCategory'");
    }
}
