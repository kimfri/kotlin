package timetracker;

import java.util.ArrayList;
import java.util.List;

public class WatchMe {
    public static void main(String[] args) {
        System.err.println("Hello from WatchMe");

        (new WatchMeManager()).goForIt(args);
    }
}
