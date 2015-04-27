package workbook.lab31;

import workbook.lab30.MyFileReader;

/**
 * Имеется файл с текстом, в котором присутствуют числа. Найти все числа, распечатать, посчитать сумму,
 * убрать все повторяющиеся числа и снова распечатать.
 */
public class DeleteNumbers {
    public static void main(String[] args) {
        String filePath = "F:/JAVA/Home_Work/Projectes/sokolov/src/workbook/lab31/text.txt";
        MyFileReader reader = new MyFileReader();
        String text = reader.readFile(filePath);

        Numbers numbers = new Numbers();
        numbers.textToNumbers(text);
        System.out.println(numbers.getFloatList());
        System.out.println("sum: " + numbers.getSum());
        numbers.deleteDuplicateNumbers();
    }
}
