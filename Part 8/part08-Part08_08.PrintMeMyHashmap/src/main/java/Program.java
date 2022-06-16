
import java.util.HashMap;

public class Program {

    /**
     * Prints all the keys in the hashmap given as a parameter
     * @param hashMap hashmap
     */
    public static void printKeys(HashMap<String, String> hashMap) {
        for (String keys : hashMap.keySet()) {
            System.out.println(keys);
        }
    }

    /**
     * Prints the keys in the hashmap given as a parameter.
     * @param hashMap hashmap
     * @param text corresponding string value to key
     */
    public static void printKeysWhere(HashMap<String, String> hashMap, String text) {
        for (String keys : hashMap.keySet()) {
            if (keys.contains(text)) {
                System.out.println(keys);
            }
        }
    }

    /**
     * Prints value in given hashmap which keys contain the given string
     * @param hashMap hashmap
     * @param text value
     */
    public static void printValuesOfKeysWhere(HashMap<String, String> hashMap, String text) {
        for (String keys : hashMap.keySet()) {
            if (keys.contains(text)) {
                System.out.println(hashMap.get(keys));  // grab the key from the hash map
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }

}
