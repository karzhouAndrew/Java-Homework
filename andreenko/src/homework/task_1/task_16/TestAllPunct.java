package homework.task_1.task_16;

import java.io.IOException;

/**
 * Created by Алексей Андреенко on 17.02.2015.
 * Найти в строке не только запятые, но и другие знаки препинания. Подсчитать их общее количество.
 */
public class TestAllPunct {
    public static void main(String[] args) throws IOException {
        AllPunct allPunct = new AllPunct();
        StringInput stringInput = new StringInput();
        allPunct.matchAllPunct(stringInput.stringInput());
        System.out.println("В этом предложении "+allPunct.numofPunct+" знаков препинания.");
    }
}
