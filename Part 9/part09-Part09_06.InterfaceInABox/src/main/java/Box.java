import java.util.ArrayList;

public class Box implements Packable{

    private ArrayList<Packable> box;
    private double maxCapacity;
    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        box = new ArrayList<>();
    }

    public void add(Packable packable) {
        if (this.weight() + packable.weight() < maxCapacity) {
            this.box.add(packable);
        }
    }

    /**
     * Combined weight of all items in a box cannot be more than
     * the max capacity of the box.
     * @return combined weight
     */
    @Override
    public double weight() {
        double total = 0;
        for (Packable item : this.box) {
            total += item.weight();
        }
        return total;
    }

    public String toString() {
        return "Box: " + box.size() + " items, total weight " + this.weight() + " kg";
    }
}
