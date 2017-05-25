package Ch_04_HowObjectsBehave;

/**
 * Created by real on 5/21/17.
 */

// Encapsulation
class GoodDog {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    void bark() {
        if (size > 60) {
            System.out.println("Wooof !Wooof !");
        } else if (size > 14) {
            System.out.println("Ruff !Ruff !");
        } else {
            System.out.println("Yip !Yip !");
        }
    }
}

public class GoodDogTestDrive {
    public static void main(String[] args) {
        GoodDog dog1 = new GoodDog();
        dog1.setSize(20);
        GoodDog dog2 = new GoodDog();
        dog2.setSize(67);

        /**
         * Array of objects
         * */
        Dog[] pets = new Dog[3];
        pets[0] = new Dog();
        pets[1] = new Dog();


        System.out.println("Dog one: " + dog1.getSize());
        System.out.println("Dog two: " + dog2.getSize());

        dog1.bark();
        dog2.bark();
    }
}
