import java.util.ArrayList;
import java.util.HashMap;

/**
 * Class used to keep track of storage units and their contents.
 */
public class StorageFacility {

    private HashMap<String, ArrayList<String>> storageUnit;

    public StorageFacility() {
        this.storageUnit = new HashMap<>();
    }

    /**
     * Adds the parameter item to the storage unit that is also
     * given as a parameter.
     * @param unit storage unit
     * @param item item in storage unit
     */
    public void add(String unit, String item) {
        this.storageUnit.putIfAbsent(unit, new ArrayList<>());
        this.storageUnit.get(unit).add(item);
    }

    /**
     * Returns a list that contains all the items in the storage unit indicated by the
     * parameter.
     * @param storageUnit all the items
     * @return empty list if no item/storage unit
     */
    public ArrayList<String> contents(String storageUnit) {
        return this.storageUnit.getOrDefault(storageUnit, new ArrayList<>());
    }

    /**
     * Removes the given item from the given storage unit.
     * @param storageUnit given storage unit
     * @param item given item
     */
    public void remove(String storageUnit, String item) {
        this.storageUnit.get(storageUnit).remove(item);

        if (this.storageUnit.get(storageUnit).isEmpty()) {
            this.storageUnit.remove(storageUnit);
        }
    }

    /**
     * Returns the names of the storage units as a list.
     * Only the units that contain items are listed.
     * @return list
     */
    public ArrayList<String> storageUnits() {
        ArrayList<String> names = new ArrayList<>();    // need to create an array list for the names

        for (String nameUnit : this.storageUnit.keySet()) { // go through values via keySet() method
            names.add(nameUnit);    // add names to the list
        }
        return names;   // return the names
    }
}
