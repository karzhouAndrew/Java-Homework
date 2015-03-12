package classes.test_file_6;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Natashka on 11.03.2015.
 */
public class TypesTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        String type = null;
        System.out.println("введите тип данных нажмите ввод");
        if (scanner.hasNext()) {
            type = scanner.next();
        }
        scanner.close();
        type = type.toLowerCase();
        TestFileReader testFileReader = new TestFileReader();
        TypeFinder typeFinder = new TypeFinder();
        typeFinder.finder(testFileReader.textToString(), type);
    }
}
