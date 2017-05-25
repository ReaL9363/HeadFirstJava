package BreakingTheSurface;

/**
 * Created by real on 4/20/17.
 */
public class PhraseOMatic {
    public static void main(String[] args) {
        String[] list1 = {"real", "ashik", "sun", "sajid"};
        String[] list2 = {"good", "bad", "jealous", "smart"};

        int len1 = list1.length;
        int len2 = list2.length;

        int rand1 = (int) (Math.random() * len1);
        int rand2 = (int) (Math.random() * len2);

        System.out.println(rand1 + " " + rand2);

        String phrase = list1[rand1] + " is " + list2[rand2];
        System.out.println(phrase);

    }
}
