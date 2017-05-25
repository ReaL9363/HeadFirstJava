package Ch_06_UsingTheJavaLibrary;

import java.util.ArrayList;

/**
 * Created by real on 5/25/17.
 */
public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public ArrayList<String> getLocationCells() {
        return locationCells;
    }

    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String checkYourself(String stringGuess) {
        String result = "miss";

        /**
         * Find out if the user guess is in the ArrayList, by asking for its index.
         * If it’s not in the list, then indexOf() returns a -1.
         */
        int index = locationCells.indexOf(stringGuess);
        if (index >= 0) {
            /**
             * If index is greater than or equal to
             * zero, the user guess is definitely in the
             * list, so remove it
             * */
            locationCells.remove(index);
            /**
             * If the list is empty, this
             * was the killing blow!
             * */
            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    }
}
