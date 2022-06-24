/**
 * Items can be added to the shopping cart.
 * An item is a product with a quantity.
 * This class emulates that process.
 */
public class Item {

    private String product;     // product
    private int qty;            // how many of a product are in the item
    private int unitPrice;      // price of a single product

    /**
     * Constructor that creates an item corresponding to the
     * product given as a parameter.
     * @param product Product
     * @param qty how many of a product are in the item
     * @param unitPrice price of a single product
     */
    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    /**
     * Item's price is found by multiplying its unit price
     * by its quantity.
     * @return price of the item.
     */
    public int price() {
        return unitPrice * qty;
    }

    /**
     * Increases the quantity by one.
     */
    public void increaseQuantity() {
        this.qty++;
    }

    /**
     * String representation of the item.
     * @return product and quantity
     */
    public String toString() {
        return this.product + ": " + this.qty;
    }
}
