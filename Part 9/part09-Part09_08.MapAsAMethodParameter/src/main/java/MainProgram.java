import java.util.HashMap;
import java.util.Map;

public class MainProgram {

    /**
     * Method that takes a Map-object as a parameter and
     * returns the size of the map object.
     * @param map map parameter.
     * @return size as an integer.
     */
    public static int returnSize(Map<String, String> map) {
        return map.size();
    }

    public static void main(String[] args) {
        Map<String, String> names = new HashMap<>();
        names.put("1", "first");
        names.put("2", "second");

        System.out.println(returnSize(names));

    }

    // Implement here a method returnSize, which takes a Map-object as a parameter
    // and returns the size of the map object
}
