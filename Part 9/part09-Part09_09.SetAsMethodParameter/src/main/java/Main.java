import java.util.HashSet;
import java.util.Set;

public class Main {

    /**
     * Returns the number of elements in the Set interface that it receives
     * as a parameter.
     * @param set
     * @return
     */
    public static int returnSize(Set<String> set) {
        return set.size();
    }

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("first");
        names.add("first");
        names.add("second");
        names.add("second");
        names.add("second");

        System.out.println(returnSize(names));

    }

    // implement the method returnSize here, which returns
    // the number of elements in the set that it receives as a parameter.

}
