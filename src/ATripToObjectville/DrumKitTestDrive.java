package ATripToObjectville;

/**
 * Created by real on 5/4/17.
 */
class DrumKit {
    boolean topHat = true;
    boolean snare = true;

    void playTopHat() {
        System.out.println("ding ding da-ding");
    }

    void playSnare() {
        System.out.println("bang bang ba - bang");
    }
}

public class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        if (d.snare == true) {
            d.playSnare();
        }
        d.snare = false;
        if (d.snare == false) {
            d.playTopHat();
        }
    }
}
