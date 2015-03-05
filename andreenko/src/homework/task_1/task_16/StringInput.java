package homework.task_1.task_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Алексей Андреенко on 17.02.2015.
 */
public class StringInput {
    private String sentence;

    public String stringInput() throws IOException {
        BufferedReader senReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку:");
        sentence = senReader.readLine();
        return sentence;
    }
}
