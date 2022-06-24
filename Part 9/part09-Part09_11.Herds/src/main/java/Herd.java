import java.util.ArrayList;
import java.util.List;

/**
 * A herd consists of multiple objects that implement
 * the Movable interface.
 */
public class Herd implements Movable {

    private List<Movable> herd; // herd must be stored in a list data structure
    public Herd() {
        this.herd = new ArrayList<>();
    }

    /**
     * Adds an object that implements the Movable interface to the herd.
     * @param movable object
     */
    public void addToHerd(Movable movable) {
        herd.add(movable);
    }

    /**
     * Moves the herd by the amount specified by the parameters.
     * @param dx x direction
     * @param dy y direction
     */
    @Override
    public void move(int dx, int dy) {

        for (Movable o : herd) {
            o.move(dx, dy); // move each member of the herd
        }
    }

    /**
     * String representation of the positions of the members of the herd,
     * each on its own line.
     * @return call our overridden toString method from Organism.
     */
    public String toString() {

        StringBuilder result = new StringBuilder();
        for (Movable s : herd) {
            result.append(s.toString().trim()).append("\n");
        }
        return result.toString();
    }
}
