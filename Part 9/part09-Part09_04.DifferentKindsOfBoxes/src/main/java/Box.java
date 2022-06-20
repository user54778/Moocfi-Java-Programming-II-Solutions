
import java.util.ArrayList;

/**
 * An abstract class where adding multiple items is implemented by
 * repeatedly calling the add method.
 */
public abstract class Box {

    public abstract void add(Item item);

    public void add(ArrayList<Item> items) {
        for (Item item : items) {
            Box.this.add(item);
        }
    }

    public abstract boolean isInBox(Item item);
}
