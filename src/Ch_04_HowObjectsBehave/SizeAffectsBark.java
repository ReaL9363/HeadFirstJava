package Ch_04_HowObjectsBehave;

/**
 * Created by real on 5/20/17.
 */
class Dog {
    int size;

    void bark() {
        if (size > 60) {
            System.out.println("Woof! woof!");
        } else if (size > 14) {
            System.out.println("Ruff ! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}

public class SizeAffectsBark {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.size = 70;
        Dog dog2 = new Dog();
        dog2.size = 20;
        Dog dog3 = new Dog();
        dog3.size = 10;

        dog.bark();
        dog2.bark();
        dog3.bark();
    }
}
