
import java.util.HashMap;

/**
 * Create a new HashMap<String,String> object.
 * Store the names and nicknames of people in the hashmap, and get matthew's
 * nickname from the hashmap. Then print it.
 */
public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!

        HashMap<String, String> nickNames = new HashMap<>();

        nickNames.put("matthew", "matt");
        nickNames.put("michael", "mix");
        nickNames.put("arthur", "artie");

        String matt = nickNames.get("matthew");
        System.out.println(matt);
    }

}
