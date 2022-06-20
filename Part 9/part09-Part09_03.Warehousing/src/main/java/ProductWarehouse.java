/**
 * Product name for the product and way to handle the name.
 */
public class ProductWarehouse extends Warehouse{

    private String productName;
    /**
     * Creates an empty warehouse, which has the capacity provided as a parameter.
     *
     * @param capacity Invalid capacity creates useless warehouse.
     */
    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }

    public String getName() {
        return this.productName;
    }

    public void setName(String newName) {
        this.productName = newName;
    }

    public String toString() {
        return this.productName + ": " + super.toString();
    }
}
