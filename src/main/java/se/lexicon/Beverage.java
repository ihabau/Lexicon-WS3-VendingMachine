package se.lexicon;

public class Beverage extends Product{

    private int volumeMl;

    public Beverage(int id, int price, int quantity, String name, int volumeMl) {
        super(id, price, quantity, name);
        this.volumeMl = volumeMl;
    }
    @Override
    public String getDescription() {
        return "beverages";
    }
}
