package classwork.class4;

import java.util.Random;

/**
 * Created by Tonya on 24.02.2015.
 */
public class TechnologyGenerator {
    private static String[] technologys = {"FRONT-END", "BACK-END", "DATABASE", "TESTER", "WEB"};

    public static String generateTechnologys(){
        Random random = new Random();
        return technologys[random.nextInt(technologys.length)];
    }

}
