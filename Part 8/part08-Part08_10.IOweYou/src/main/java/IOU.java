import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> IOU;

    /**
     * Creates a new IOU via hashmap.
     */
    public IOU() {
        this.IOU = new HashMap<>();
    }

    /**
     * Saves the amount owed and the person owed to the IOU.
     * @param toWhom person owed to.
     * @param amount amount owed.
     */
    public void setSum(String toWhom, double amount) {
        this.IOU.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.IOU.getOrDefault(toWhom, 0.0);
    }
}
