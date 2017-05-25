package Ch_06_UsingTheJavaLibrary;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by real on 5/25/17.
 */
public class DotComBust {
    private GameHelper helper = new GameHelper();
    private List<DotCom> dotComsList = new ArrayList<>();
    private int numOfGuess = 0;

    private void setUpGame() {
        // first make some dot coms and give them locations
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");
        for (DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        } // close for loop
    }

    public static void main(String[] args) {


    }
}
