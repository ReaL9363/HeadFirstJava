package BreakingTheSurface;

/**
 * Created by real on 4/20/17.
 */
public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";
        while (beerNum > 0) {
            if (beerNum == 0) {
                word = "bottle";
            }
            beerNum = beerNum - 1;
            if (beerNum > 0) {
                System.out.println(beerNum);
            } else {
                System.out.println("No beer");
            }
        }
    }
}
