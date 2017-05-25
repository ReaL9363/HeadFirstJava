package BreakingTheSurface;

/**
 * Created by real on 5/4/17.
 */

// Page 26
class Test {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {
            y = x - y;
            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }
}
