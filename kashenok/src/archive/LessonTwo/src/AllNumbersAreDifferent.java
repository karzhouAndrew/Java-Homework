import com.sun.deploy.util.ArrayUtil;
import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.lang.reflect.Array;
import java.util.Random;

public class AllNumbersAreDifferent {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100000) + 1;
        String str = Integer.toString(number);
        int length = str.length();
        char buf[] = new char[length];
        str.getChars(0, length, buf, 0);
        System.out.print("Случайное число рано: " + str + ". Третий символ этого числа будет равен: " + buf[3] + ", а обратная последовательность этого числа будет: ");


    }
}

