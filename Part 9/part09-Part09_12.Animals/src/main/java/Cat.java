/**
 * Another class that also inherits from the Animal class.
 * Mimics cat behavior.
 */
public class Cat extends Animal implements NoiseCapable{

    public Cat(String name) {
        super(name);
    }

    /**
     * Makes the name simply "Cat"
     */
    public Cat() {
        super("Cat");
    }

    /**
     * Calls the super class get name method and along with it prints "purrs".
     */
    public void purr() {
        System.out.println(super.getName() + " purrs");
    }

    @Override
    public void makeNoise() {
        this.purr();
    }
}
