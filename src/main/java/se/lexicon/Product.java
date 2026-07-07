package se.lexicon;

public abstract class Product {



    protected int id;
    protected int price;
    protected int quantity;
    protected String name;

    public Product(int id, int price, int quantity, String name) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.name = name;
    }

    //getters
    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getId() { return id; }

    public String getName() { return name; }


    public abstract String getDescription();

    public String examine() {
        return "";
    }

    public String use() {
        return "";
    }

    public void decreaseQuantity() {
        this.quantity -=1;

    }


}
