import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {


    private ArrayList<Item> itemArrayList;
    private int capacity;
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        itemArrayList = new ArrayList<>();
    }

    /**
     * Defines the max weight allowed for that box. ONLY adds an item when
     * it won't cause the boxes maximum weight capacity to be exceeded.
     * @param item box
     */
    @Override
    public void add(Item item) {
        if (!(itemWeight() + item.getWeight() > capacity)) {
            itemArrayList.add(item);
        }
    }

    /**
     * Return the items in the box
     * @param item items in the box
     * @return box
     */
    @Override
    public boolean isInBox(Item item) {
        return itemArrayList.contains(item);
    }

    /**
     * Helper method for add method that adds the weight of each item in our
     * arraylist.
     * @return weight of item
     */
    public int itemWeight() {
        int weight = 0;
        for (Item item : itemArrayList) {
            weight += item.getWeight();
        }
        return weight;
    }
}
