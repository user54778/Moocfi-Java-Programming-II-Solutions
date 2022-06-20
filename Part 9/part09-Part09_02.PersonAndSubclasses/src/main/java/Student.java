/**
 * Class for students that inherits the properties of the person class.
 */
public class Student extends Person {

    private int credits;
    public Student(String name, String address) {   // we dont want credits in our constructor parameters
        super(name, address);
    }

    /**
     * Everytime the student studies the amount of study credits goes up.
     */
    public void study() {
        this.credits++;
    }

    /**
     * Study credits.
     * @return study credit
     */
    public int credits() {
        return credits;
    }

    /**
     * Superclass toString along with its own version of toString.
     * @return super class toString along with credits.
     */
    public String toString() {
        return super.toString() + "\n  Study credits " + credits;
    }
}
