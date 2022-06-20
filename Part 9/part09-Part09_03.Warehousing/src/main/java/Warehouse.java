

public class Warehouse {

    private double capacity;
    private double balance;

    /**
     * Creates an empty warehouse, which has the capacity provided as a parameter.
     * @param capacity Invalid capacity creates useless warehouse.
     */
    public Warehouse(double capacity) {
        if (capacity > 0.0) {
            this.capacity = capacity;
        } else {
            this.capacity = 0.0;
        }

        this.balance = 0.0;
    }

    /**
     * Returns balance of warehouse.
     * @return Capacity which is taken up by items in the warehouse.
     */
    public double getBalance() {
        return this.balance;
    }

    /**
     * Returns total capacity of warehouse.
     * @return Capacity from constructor.
     */
    public double getCapacity() {
        return this.capacity;
    }

    /**
     * Returns a value of how much space is left in the warehouse.
     * @return space left
     */
    public double howMuchSpaceLeft() {
        return this.capacity - this.balance;
    }

    /**
     * Adds the desired amount to the warehouse.
     * If the amount is negative, nothing changes, and if everything doesn't fit,
     * the warehouse is filled up and the rest overflows.
     * @param amount desired amount
     */
    public void addToWarehouse(double amount) {
        if (amount < 0) {
            return;
        }
        if (amount <= howMuchSpaceLeft()) {
            this.balance = this.balance + amount;
        } else {
            this.balance = this.capacity;
        }
    }

    /**
     * Take the desired amount from the warehouse.
     * If the desired amount is negative, nothing changes, and we return 0.
     * If the desired amount is greater than the amount the warehouse contains, we get all
     * we can take and the warehouse is emptied.
     * @param amount desired amount
     * @return Actual amount we get
     */
    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            return 0.0;
        }
        if (amount > this.balance) {
            double allThatWeCan = this.balance;
            this.balance = 0.0;
            return allThatWeCan;
        }

        this.balance = this.balance - amount;
        return amount;
    }

    /**
     * State of object represented as string.
     * @return toString
     */
    public String toString() {
        return "balance = " + this.balance + ", space left " + howMuchSpaceLeft();
    }
}
