package classes.lab10.lab10_1;

public class GenerateRandomNumbers {

    public static int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

}
