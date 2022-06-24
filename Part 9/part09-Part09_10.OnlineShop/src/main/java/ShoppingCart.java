import java.util.HashMap;
import java.util.Map;

/**
 * Stores products added as Item-Objects.
 *
 */
public class ShoppingCart {

    private Map<String, Item> cart;

    public ShoppingCart() {
        cart = new HashMap<>();
    }

    /**
     * Adds an item to the cart that matches the product given as
     * a parameter, with the price given as a parameter.
     * @param product product
     * @param price price of product
     */
    public void add(String product, int price) {
        if (cart.containsKey(product)) {
            increaseQuantity(product);
        } else {
            cart.put(product, new Item(product, 1, price));
        }
    }

    /**
     * Total price of the shopping cart.
     * @return price of cart.
     */
    public int price() {

        int totalPrice = 0; // counter for price of shopping cart

        for (Item item : cart.values()) { // we need to loop over the prices in the map.
            totalPrice += item.price();
        }
        return totalPrice;
    }

    public void print() {
        for (Item item : cart.values()) {
            System.out.println(item);
        }
    }

    public void increaseQuantity(String product) {
        cart.get(product).increaseQuantity();
    }
}
