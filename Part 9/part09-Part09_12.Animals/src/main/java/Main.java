
public class Main {

    public static void main(String[] args) {
        NoiseCapable dog = new Dog();
        dog.makeNoise();

        Cat cat = new Cat("Garfield");
        cat.makeNoise();
        Cat c = cat;
        c.purr();
    }

}
