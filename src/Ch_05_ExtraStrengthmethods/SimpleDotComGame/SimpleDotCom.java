package Ch_05_ExtraStrengthmethods.SimpleDotComGame;

/**
 * Created by real on 5/24/17.
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
        // System.out.println("guess " + guess);
        String result = "miss";
        for (int cell : locationCells) {
            if (guess == cell) {
                //System.out.println("cell =" + cell);
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}
