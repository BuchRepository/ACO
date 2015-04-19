package TestSierra.Echo;

/**
 *  Exemple - Clock from books Sierra 25/03/15 page 118
 */
public class Clock {
    String time;

    void setTime(String t) {
        time = t;
    }
    String getTime() {
        return time;
    }
}
class ClockTestDrive {
    public static void main(String [] args) {
        Clock c = new Clock ();
        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("время:"+tod );
}
}
