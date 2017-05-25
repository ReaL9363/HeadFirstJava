package Ch_05_ExtraStrengthmethods.test;

import Ch_05_ExtraStrengthmethods.SimpleDotCom;

/**
 * Created by real on 5/22/17.
 */
public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        /**
         * Test code
         * String testResult = "failed";
         if (result.equals("hit")) {
         testResult = "passed";
         }
         System.out.println(testResult);
         * */
    }
}
