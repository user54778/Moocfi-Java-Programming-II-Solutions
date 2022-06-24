import java.util.ArrayList;
import java.util.List;

public class mainProgram {

    /**
     * Implement a class method which is given a List-object as a parameter, and returns
     * the size of the list as an integer.
     * @param list list parameter.
     * @return size of list as integer.
     */
    public static int returnSize(List<String> list) {
        return list.size();
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");

        System.out.println(returnSize(names));

    }
}
