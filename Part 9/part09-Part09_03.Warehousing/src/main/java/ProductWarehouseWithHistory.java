/**
 * Also provides services related to the change history of the warehouse inventory.
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history;
    /**
     * Creates an empty warehouse, which has the capacity provided as a parameter.
     * Initial balance as initial balance of warehouse, as well as first value of
     * the change history.
     * @param productName
     * @param capacity    Invalid capacity creates useless warehouse.
     */
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        history = new ChangeHistory();
        super.addToWarehouse(initialBalance);
        history.add(initialBalance);    // need to ALSO add our balance to the arraylist itself
    }

    /**
     * Returns the product history using the string representation of the ChangeHistory object.
     * @return product history.
     */
    public String history() {
        return history.toString();
    }

    /**
     * Works just like method in Warehouse class, except we also record the changed
     * state to the history.
     * @param amount desired amount
     */
    public void addToWarehouse(double amount) {

        double changeState = 0;

        changeState = super.getBalance() + amount;
        history.add(changeState);   // records changed state to history
        super.addToWarehouse(amount);
    }

    /**
     * Works just like method in the Warehouse class, but also records
     * the changed state to the history.
     * @param amount desired amount
     * @return amount
     */
    public double takeFromWarehouse(double amount) {

        double changeState = 0; // don't need to worry about it being less, since the original already does that

        changeState = super.getBalance() - amount;  // same as original method
        history.add(changeState);                   // add history to our arraylist
        return super.takeFromWarehouse(amount);            // take amount away
    }

    public void printAnalysis() {
        System.out.println("Product: " + getName());
        System.out.println("History: " + history.toString());
        System.out.println("Largest amount of product: " + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average: " + history.average());
    }
}
