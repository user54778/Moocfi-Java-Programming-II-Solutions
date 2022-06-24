/**
 * Class dog the inherits from Animal.
 * Mimics dog behavior.
 */
public class Dog extends Animal implements NoiseCapable{
    public Dog(String name) {
        super(name);
    }

    /**
     * Non-parameterized constructor which gives the dog
     * the name "Dog".
     */
    public Dog() {
        super("Dog");
    }

    /**
     * Non-parameterized bark, which calls the getName method from the superclass.
     */
    public void bark() {
        System.out.println(super.getName() + " barks");
    }

    @Override
    public void makeNoise() {
        this.bark();
    }
}
