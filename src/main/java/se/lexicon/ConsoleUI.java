package se.lexicon;
import java.util.Scanner;

public class ConsoleUI {

    private VendingMachine machine = new VendingMachineImpl();
    private Scanner input = new Scanner(System.in);

    public ConsoleUI(VendingMachine machine) {
        this.machine = machine;
    }

    public void displayMenu() {
        System.out.println("Welcome to Lexicon Vending Machine");
        System.out.println("----------------------------------");

    }

    public void run() {
        displayMenu();
        displayProducts();
        while (true) {
            handleInsertCoin();
            handlePurchase();
            handleReturnChange();
        }
    }

    public void handleInsertCoin() {
        System.out.println("Balance: " + this.machine.getBalance() + " kr");
        this.machine.insertCoin(input.nextInt());
        System.out.println( "Balance: " + this.machine.getBalance());
    }

    public void handlePurchase() {
        this.machine.purchaseProduct(input.nextInt());

    }

    public void handleReturnChange() {
        this.machine.returnChange();
    }

    public void displayProducts() {
        for (Product p : this.machine.getProducts() ) {
            System.out.printf("[%d] %-10s - %2d kr  (%s)        Stock: %d\n",
                    p.getId(), p.getName(), p.getPrice(), p.getDescription(), p.getQuantity());
        }
        System.out.println("----------------------------------");

    }

}
