package Ch_04_HowObjectsBehave;

/**
 * Created by real on 5/22/17.
 */
class Clock {
    private String time;

    void setTime(String t) {
        time = t;
    }

    String getTime() {
        return time;
    }
}

public class ClockTestDrive {
    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("time: " + tod);
    }
}