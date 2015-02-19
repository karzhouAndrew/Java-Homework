package classes.blinov1;

/**
 * Created by Natashka on 18.02.2015.
 */
public class SameWordTest {
    public static void main(String[] args) {
        String str="павел вася маша павел.Nata nata nata nata света света павел вася!? иван иван павел света иван!";
        SameWordFinder sameWordFinder=new SameWordFinder();
        sameWordFinder.setStr(str);
        sameWordFinder.sameWord();
    }
}
