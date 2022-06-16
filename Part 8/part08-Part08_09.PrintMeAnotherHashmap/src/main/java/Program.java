
import java.util.HashMap;

public class Program {

    /**
     * Print all the values in the hashmap given as a parameter using the toString method
     * of the Book objects
     * @param hashMap hashmap
     */
    public static void printValues(HashMap<String, Book> hashMap) {
        for (Book key : hashMap.values()) {
            System.out.println(key);
        }
    }

    /**
     * Prints ONLY the Books in the given hashmap which name is contained
     * in the given string.
     * @param hashMap hashmap
     * @param text given string
     */
    public static void printValueIfNameContains(HashMap<String, Book> hashMap, String text) {
        for (Book key : hashMap.values()) {
            if (key.getName().contains(text)) {
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }

}
