import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Warehouse of products with price and stock of the products stored in a Map interface.
 */
public class Warehouse {

    private Map<String, Integer> products;  // store the products in the warehouse
    private Map<String, Integer> balance;   // save stock balance of products

    /**
     * Default constructor.
     */
    public Warehouse() {
        products = new HashMap<>();
        balance = new HashMap<>();
    }

    /**
     * Adds a product to the warehouse with price and stock.
     * @param product particular product
     * @param price price of product
     * @param stock stock of product
     */
    public void addProduct(String product, int price, int stock) {
        this.products.put(product, price);
        this.balance.put(product, stock);
    }

    /**
     * Price of the product received as a parameter.
     * If not added to the warehouse, it returns -99.
     * @param product product.
     * @return
     */
    public int price(String product) {
        if (!products.containsKey(product)) {
            return -99;
        }
        return products.get(product);
    }

    /**
     * Returns the current remaining stock of the product in the warehouse.
     * If the product hasn't been added, it returns 0.
     * @param product Product.
     * @return remaining stock of product.
     */
    public int stock (String product) {
        if (!balance.containsKey(product)) {
            return 0;
        }
        return balance.get(product);
    }

    /**
     * Reduces the stock remaining for the product it received as a parameter
     * by one, and returns true if there was stock remaining.
     * Returns false otherwise.
     * A products stock can not go below zero.
     * @param product product
     * @return false
     */
    public boolean take(String product) {
        if (stock(product) > 0) {
            balance.put(product, balance.get(product) - 1); // remove ONLY one item, maps remove takes all items so cant use
            return true;
        }

        return false;
    }

    /**
     * Names of products in the warehouse as a Set.
     * @return name of products
     */
    public Set<String> products() {
        return this.products.keySet();
    }
}
