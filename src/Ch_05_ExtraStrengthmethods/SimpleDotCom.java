package Ch_05_ExtraStrengthmethods;

/**
 * Created by real on 5/22/17.
 */
public class SimpleDotCom {
    int numOfHits = 0;
    int[] locationCells = new int[3];

    public int[] getLocationCells() {
        return locationCells;
    }

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }

    public String checkYourself(String stringGuess) {

        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            } // end if
        } // end for
        if (numOfHits == locationCells.length) {
            result = "kill";
        } // end if
        System.out.println(result);
        return result;
    }
}
