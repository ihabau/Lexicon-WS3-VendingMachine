package se.lexicon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        VendingMachine machine = new VendingMachineImpl();
        Beverage cola = new Beverage(0, 15, 15,"cola", 33);

        machine.insertCoin(1);
        machine.insertCoin(2);
        machine.insertCoin(5);
        machine.insertCoin(3);
        System.out.println(machine.getBalance());

        System.out.println(cola.getName() + cola.getDescription() + cola.quantity);
    }
}
