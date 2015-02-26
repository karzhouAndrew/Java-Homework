package benchmark;

/**
 * Created by user on 25.02.2015.
 */

public class StringExecutor {


    public String executeString() {
        String str = "Я изучаю рефлекшион";
        for (int i = 0; i < 1000; i++) {
            str += "очень усиленно";
        }
        return str;
    }

}
