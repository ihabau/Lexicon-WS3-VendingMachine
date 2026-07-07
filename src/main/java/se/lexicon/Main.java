package se.lexicon;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public void main(String[] args) {
        //creat vending machine
        VendingMachine machine = new VendingMachineImpl();
        //creat and add product
        machine.addProduct(new Snack(1, 15, 5, "Chips", 130));
        machine.addProduct(new Beverage(2, 20, 3, "Cola", 330));
        machine.addProduct(new Fruit(3, 10, 8, "Apple", "Sweden"));
        //creat the ui console and attach it to the vending machine machine

        ConsoleUI ui = new ConsoleUI(machine);
        //run the ui
        ui.run();

        /*
        //creat product
        Beverage cola = new Beverage(0, 15, 1,"cola", 330);
        Beverage seven = new Beverage(0, 15, 6,"seven", 330);
        Snack mars = new Snack(0, 12, 20, "MARS", 250);
        Fruit banana = new Fruit(2, 8,16,"Banana", "Colombia");
        //add product to vending machine
        machine.addProduct(cola);
        machine.addProduct(seven);
        machine.addProduct(mars);
        machine.addProduct(banana);


        machine.insertCoin(1);
        machine.insertCoin(2);
        machine.insertCoin(5);
        machine.insertCoin(3);
        System.out.println(machine.getBalance());

        System.out.println(machine.getProducts().length);
        for (Product p : machine.getProducts()) {
            System.out.println(p.getName());
        }
        System.out.println(cola.getDescription() + " || " + cola.quantity);
        machine.purchaseProduct(0);
        System.out.println(cola.getDescription() + " || " + cola.quantity);
        machine.insertCoin(20);
        System.out.println(machine.getBalance());
        machine.purchaseProduct(0);
        System.out.println(cola.getDescription() + " || " + cola.quantity);
        System.out.println(machine.getBalance());
        System.out.println(machine.returnChange());
        System.out.println(machine.getBalance());
        //System.out.println(seven.getDescription() + " || " + seven.quantity);
        //System.out.println(mars.getDescription() + " || " + mars.quantity);
        //System.out.println(banana.getDescription() + " || " + banana.quantity);
        */


    }
}
