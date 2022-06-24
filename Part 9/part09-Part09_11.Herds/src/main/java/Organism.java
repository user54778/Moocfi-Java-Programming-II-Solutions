import java.util.ArrayList;

/**
 * Class that implements the interface Movable.
 * An organism should know its own location.
 */
public class Organism implements Movable{

    private int x;
    private int y;

    /**
     * Receives x and y coordinates of the initial position as its parameters.
     * @param x position.
     * @param y position.
     */
    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * String representation of organism.
     * @return override toString
     */
    public String toString() {
        return "x: " + this.x + "; y: " + this.y;
    }

    /**
     * Moves the object by the values it receives as parameters.
     * @param dx contains the change to coordinate x.
     * @param dy contains the change to coordinate y.
     */
    @Override
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
}
