package KnowYourVariables;

/**
 * Created by real on 5/7/17.
 */
public class Dog {
    String name;

    public static void main(String[] args) {
        // make a Dog object and access it
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Tommy";

        // now make a Dog array
        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        // now access the Dogs using the array
        // references
        myDogs[0].name = "unlce";
        myDogs[1].name = "Bob";

        // Hmmmm... what is myDogs[2] name?
        System.out.print("last dog’s name is ");
        System.out.println(myDogs[2].name);

        // now loop through the array
        // and tell all dogs to bark
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x++;
        }
    }

    private void bark() {
        System.out.println(name + " Gheu gheu !!!!!");
    }
}
