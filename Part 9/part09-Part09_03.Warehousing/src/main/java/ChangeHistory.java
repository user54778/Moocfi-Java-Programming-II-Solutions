import java.util.ArrayList;

/**
 * Class for specializing in how inventory of a product changes over time.
 */
public class ChangeHistory {

    private final ArrayList<Double> history;
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    /**
     * Adds provided status as the latest amount to remember in the change history.
     * @param status provided status
     */
    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    /**
     * Return the largest value in the change history unless history is empty, then return
     * zero.
     * @return largest value
     */
    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double max = this.history.get(0);
        for (Double maximum : this.history) {
            if (maximum > max) {
                max = maximum;
            }
        }
        return max;
    }

    /**
     * Return smallest value in change history unless it is empty,
     * then it returns 0.
     * @return smallest value
     */
    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double min = this.history.get(0);
        for (Double minimum : this.history) {
            if (minimum < min) {
                min = minimum;
            }
        }
        return min;
    }

    /**
     * Averages the values in the change history.
     * @return average
     */
    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        }

        int length = this.history.size();
        double sum = 0;
        for (Double num : this.history) {
            sum += num;
        }
        return sum / length;
    }

    /**
     * String representation of the change history
     * @return string representation provided by the ArrayList class.
     */
    public String toString() {
        return history.toString();
    }
}
