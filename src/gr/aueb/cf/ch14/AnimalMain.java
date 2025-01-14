package gr.aueb.cf.ch14;

public class AnimalMain {

    public static void main(String[] args) {
        Dog dog = new Dog("Anti", 14, "Bull Terrier");
        dog.makeSound();
        dog.searchFood();

        doMakeSound(dog);
    }

    public static void doMakeSound(Animal animal) {
        animal.makeSound();
    }
}
