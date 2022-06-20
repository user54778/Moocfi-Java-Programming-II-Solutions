/**
 * Teacher class that inherits the properties of the Person class.
 */
public class Teacher extends Person {

    private int pay;
    public Teacher(String name, String address, int pay) {
        super(name, address);
        this.pay = pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public String toString() {
        return super.toString() + "\n  salary " + this.pay + " euro/month";
    }
}
