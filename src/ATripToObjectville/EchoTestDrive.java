package ATripToObjectville;

/**
 * Created by real on 5/4/17.
 */
class Echo {
    int count = 0;

    void hello() {
        System.out.println("helloooo... ");
    }
}

public class EchoTestDrive {
    public static void main(String[] args) {
        Echo e1 = new Echo();
        Echo e2 = new Echo();
        int x = 0;
        while (x < 4) {
            System.out.println("x = " + x);
            e1.hello();
            e1.count = e1.count + 1;
            System.out.println("e1.count " + e1.count);
            if (x == 3) {
                e2.count = e2.count + 1;
                System.out.println("when x=3 " + e2.count);
            }
            if (x > 0) {
                e2.count = e2.count + e1.count;
                System.out.println("when x>0 " + e2.count);
            }
            //System.out.println("e2.count " + e2.count);
            x = x + 1;
            System.out.println();
        }
        System.out.println(e2.count);

    }
}
