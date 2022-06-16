import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> abbreviation;   // hashmap field

    public Abbreviations() {
        this.abbreviation = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviation.put(abbreviation, explanation);
    }

    /**
     * Checks if an abbreviation has already been added.
     * @param abbreviation abbreviation
     * @return true if yes; false otherwise
     */
    public boolean hasAbbreviation(String abbreviation) {
        if (this.abbreviation.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }

    /**
     * Finds the explanation for an abbreviation.
     * @param abbreviation explanation for abbreviation.
     * @return explanation; null otherwise
     */
    public String findExplanationFor(String abbreviation) {
        return this.abbreviation.get(abbreviation);
    }

}
