package se.lexicon;

public interface VendingMachine {

    public Product[] getProducts();
    public Product purchaseProduct(int id);

    public void addProduct(Product product);
    public void insertCoin(int value);
    public int returnChange() ;
    public int getBalance();

}
