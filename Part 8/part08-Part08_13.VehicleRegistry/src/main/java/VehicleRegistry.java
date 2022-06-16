import java.util.ArrayList;
import java.util.HashMap;

/**
 * Used to register information about vehicles involving license plates and their owners.
 */
public class VehicleRegistry {

    private HashMap<LicensePlate, String> licenseInfo;
    public VehicleRegistry() {
        licenseInfo = new HashMap<>();
    }

    /**
     * Assigns the owner it received as a parameter to a car that corresponds to the license
     * plate received as a parameter. If the license plate doesn't have an owner, the
     * method returns true. Otherwise, returns false.
     * @param licensePlate actual license plate
     * @param owner of license plate
     * @return true
     */
    public boolean add(LicensePlate licensePlate, String owner) {
        // we need to look over each key, and then we can determine the equality of the keys
        for (LicensePlate plate : licenseInfo.keySet()) {
            if (plate.equals(licensePlate)) {
                return false;
            }
        }
        this.licenseInfo.put(licensePlate, owner);
        return true;
    }

    /**
     * Returns the owner of the car corresponding to the license plate received as a parameter.
     * @param licensePlate license plate
     * @return null otherwise
     */
    public String get(LicensePlate licensePlate) {
        for (LicensePlate plate : licenseInfo.keySet()) {
            if (licenseInfo.containsKey(licensePlate)) {
                return licenseInfo.get(licensePlate);   // could just return this line and it would still work
            }
        }
        return null;
    }

    /**
     * Removes the license plate and attached data from the registry.
     * @param licensePlate license plate
     * @return false if license plate isn't found
     */
    public boolean remove(LicensePlate licensePlate) {
        if (licenseInfo.containsKey(licensePlate)) {
            licenseInfo.remove(licensePlate);
            return true;
        }
        return false;
    }

    /**
     * Prints the license plates in the registry
     */
    public void printLicensePlates() {
        for (LicensePlate licensePlate : licenseInfo.keySet()) {    // iterate over keys via keySet method
            System.out.println(licensePlate);
        }
    }

    /**
     * Prints the owners of the cars in the registry.
     */
    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();   // new ArrayList for remembering owners already printed

        // values() returns a view of the values
        // contained in the map
        for (String ownerRemember : licenseInfo.values()) {
            if (!owners.contains(ownerRemember)) {
                owners.add(ownerRemember);
            }
        }

        for (String in : owners) {
            System.out.println(in); // print owners of car registry
        }
    }
}
