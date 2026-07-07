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
        //should validate if product is in stock
        for( Product product : products  ) {
            if (product.getId() == id ) {

                if (product.getQuantity() <= 0) {
                    System.out.println("stock is empty");
                    return null;
                }

                if (product.getPrice() > getBalance()) {
                    System.out.println("Add more money!");
                    return null;
                }

                System.out.printf("Dispensing: %s (%s)\n", product.getName(), product.getDescription());
                product.decreaseQuantity();
                depositPool -= product.getPrice();
                return product;
            }
        }
        System.out.println("id not recognized");
        return null;
    }

    @Override
    public Product[] getProducts() {
        return products.toArray(new Product[0]);
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void insertCoin(int value) {
        if (Denomination.isValidCoin(value)) {
            depositPool += value;
            System.out.println("Insert coin: " + value);
        } else {
            System.out.println("invalid coin!");
        }
    }

    @Override
    public int returnChange() {
        if (depositPool == 0) {
            System.out.println("No balance to return.");
            return depositPool;
        }
        int change = depositPool;
        depositPool = 0;
        System.out.println("Change returened: " + change + "kr");
        return change;
    }

    @Override
    public int getBalance() {
        return depositPool;
    }

}
