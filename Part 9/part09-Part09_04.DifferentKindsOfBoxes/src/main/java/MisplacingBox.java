import java.util.ArrayList;

public class MisplacingBox extends Box {

    private ArrayList<Item> items;  // list of misplaced items

    /**
     * Creates new arraylist of items to add to.
     */
    public MisplacingBox() {
        this.items = new ArrayList<>();
    }

    /**
     * Add an item to the arraylist of items.
     * @param item item in box
     */
    @Override
    public void add(Item item) {
        this.items.add(item);
    }

    /**
     * Items can never be found when looked for, since its always misplaced.
     * @param item Item
     * @return false
     */
    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}
