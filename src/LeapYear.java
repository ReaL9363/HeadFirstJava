import java.util.Scanner;

/**
 * Created by real on 4/26/17.
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is Leap Year");
//        } else if (year % 400 == 0) {
//            System.out.println(year + " is Leap Year");
        } else {
            System.out.println(year + " is not Leap Year");
        }
    }
}
