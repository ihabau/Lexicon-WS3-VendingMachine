package se.lexicon;

import java.util.ArrayList;

public class VendingMachineImpl implements VendingMachine{

    //private

    private ArrayList<Product> products = new ArrayList<>();
    private int depositPool;

    //constructor
    public VendingMachineImpl() {}

    @Override
    public Product purchaseProduct(int id) {
        //missing logic
        for( Product product : products  ) {
            if (product.id == id) {
                return product;
            } else {
                System.out.println("no id recognized");
            }
        }
        return null;
    }

    @Override
    public Product[] getProducts() {
        return new Product[0];
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void insertCoin(int value) {
        if (Denomination.TWO.isValidCoin(value)) {
            depositPool += value;
        } else {
            System.out.println("invalid coin!");
        }
    }

    @Override
    public int returnChange() {
        //return 0 because there is no counter/logic right now.
        return 0;
    }

    @Override
    public int getBalance() {
        return depositPool;
    }

}
