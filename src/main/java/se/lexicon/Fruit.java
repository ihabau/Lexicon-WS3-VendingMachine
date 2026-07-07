package se.lexicon;

public class Fruit extends Product{

    private String origin;

    public Fruit(int id, int price, int quantity, String name, String origin) {
        super(id, price, quantity, name);
        this.origin = origin;
    }

    @Override
    public String getDescription() {
        return "";
    }
}
