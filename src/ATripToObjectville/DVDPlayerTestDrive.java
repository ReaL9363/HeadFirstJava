package ATripToObjectville;

/**
 * Created by real on 5/4/17.
 */

class DVDPlayer {
    boolean canRecord = false;

    void recordDVD() {
        System.out.println("DVD recording");
    }

    void playDVD() {
        System.out.println("DVD playing");
    }
}

public class DVDPlayerTestDrive {
    public static void main(String[] args) {
        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        d.playDVD();
        if (d.canRecord == true) {
            d.recordDVD();
        }
    }

}