
public interface TacoBox {

    /**
     * Number of tacos remaining
     * @return number of tacos
     */
    int tacosRemaining();

    /**
     * Reduces number of tacos remaining by one.
     * Must be non-negative.
     */
    void eat();
}
