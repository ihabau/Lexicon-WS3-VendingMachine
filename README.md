# Workshop — OOP Vending Machine

## Class Diagram


```mermaid
classDiagram
    class Product {
        <<abstract>>
        # int id
        # String name
        # int price
        # int quantity
        + Product(id, name, price, quantity)
        + int getId()
        + String getName()
        + int getPrice()
        + int getQuantity()
        + abstract String getDescription()*
        + String examine()
        + String use()
        + void decreaseQuantity()
    }

    class Snack {
        - int weightGrams
        + Snack(id, name, price, quantity, weightGrams)
        + String getDescription()
    }

    class Beverage {
        - int volumeMl
        + Beverage(id, name, price, quantity, volumeMl)
        + String getDescription()
    }

    class Fruit {
        - String origin
        + Fruit(id, name, price, quantity, origin)
        + String getDescription()
    }

    class VendingMachine {
        <<interface>>
        + int returnChange()
        + int getBalance()
        + Product[] getProducts()
        + Product purchaseProduct(int id)
        + void addProduct(Product product)
        + void insertCoin(int value)

    }

    class VendingMachineImpl {
        - Product[] products
        - int depositPool
        + Product purchaseProduct(int id)
        + int returnChange()
        + int getBalance()
        + Product[] getProducts()
        + VendingMachineImpl()
        + void addProduct(Product product)
        + void insertCoin(int value)

    }

    class ConsoleUI {
        - VendingMachine machine
        - Scanner scanner
        + ConsoleUI(VendingMachine machine)
        + void displayMenu()
        + void run()
        - void handleInsertCoin()
        - void handlePurchase()
        - void handleReturnChange()
        - void displayProducts()
    }

    class Denomination {
        <<enumeration>>
        + int getValue()
        + boolean isValidCoin(int value)
        + int[] ACCEPTED_VALUES
    }

    Product <|-- Snack : extends
    Product <|-- Beverage : extends
    Product <|-- Fruit : extends
    VendingMachine <|.. VendingMachineImpl : implements
    VendingMachineImpl o-- Product : contains
    ConsoleUI --> VendingMachine : uses
    VendingMachineImpl --> Denomination : validates
```


## Simplified Class Diagram (exercise-only)

```mermaid
classDiagram
    class Product {
        <<abstract>>
        # int id
        # String name
        # int price
        # int quantity
        + Product(id, name, price, quantity)
        + int getId()
        + String getName()
        + int getPrice()
        + int getQuantity()
        + abstract String getDescription()*
        + void decreaseQuantity()
    }

    class Snack {
        - int weightGrams
        + Snack(id, name, price, quantity, weightGrams)
        + String getDescription()
    }

    class Beverage {
        - int volumeMl
        + Beverage(id, name, price, quantity, volumeMl)
        + String getDescription()
    }

    class Fruit {
        - String origin
        + Fruit(id, name, price, quantity, origin)
        + String getDescription()
    }

    class VendingMachine {
        <<interface>>
        + void addProduct(Product product)
        + void insertCoin(int value)
        + Product purchaseProduct(int id)
        + int returnChange()
        + int getBalance()
        + Product[] getProducts()
    }

    class VendingMachineImpl {
        - Product[] products
        - int depositPool
        + VendingMachineImpl()
        + void addProduct(Product product)
        + void insertCoin(int value)
        + Product purchaseProduct(int id)
        + int returnChange()
        + int getBalance()
        + Product[] getProducts()
    }

    class ConsoleUI {
        - VendingMachine machine
        - Scanner scanner
        + ConsoleUI(VendingMachine machine)
        + void run()
    }

    Product <|-- Snack : extends
    Product <|-- Beverage : extends
    Product <|-- Fruit : extends
    VendingMachine <|.. VendingMachineImpl : implements
    VendingMachineImpl o-- Product : contains
    ConsoleUI --> VendingMachine : uses
```

## Relationships

| Relationship | Type | Description |
|---|---|---|
| `Product` ← `Snack/Beverage/Fruit` | Inheritance | Each product type extends the abstract `Product` base class |
| `Product` | Abstract | Cannot be instantiated directly — forces subclasses to implement `getDescription()` |
| `VendingMachine` ← `VendingMachineImpl` | Realization (Interface → Implementation) | All machine logic behind an interface for testability |
| `VendingMachineImpl` → `Product[]` | Composition | The machine owns an array of products |
| `ConsoleUI` → `VendingMachine` | Dependency | UI depends on the interface, not the implementation |
| `VendingMachineImpl` → `Denomination` | Dependency | Validates coin values against accepted denominations |
