package se.lexicon;

public class Snack extends Product{

    private int wightInGram;

    public Snack(int id, int price, int quantity, String name, int wightInGram) {
        super(id, price, quantity, name);
        this.wightInGram = wightInGram;
    }

    @Override
    public String getDescription() {
        return "";
    }
}
