package workbook.lab31;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Имеется файл с текстом, в котором присутствуют числа. Найти все числа, распечатать,
 * посчитать сумму, убрать все повторяющиеся числа и снова распечатать.
 */
public class Load {
    public static void main(String[] args) throws IOException {

        FileWriter text;
        try {
            text = new FileWriter("File_task31.txt");
        } catch (FileNotFoundException e) {
            System.out.print("File not found");
            return;
        }
        text.write("Имеется файл с текстом, в котором присутствуют числа5 6. Найти все1000 числа, 9 8распечатать, посчитать сумму,12 3 убрать все повторяющиеся числа5 и снова 9распечатать.");
        text.close();

        BufferedReader fileInputStream = new BufferedReader(new FileReader("File_task31.txt"));
        String res = fileInputStream.readLine();
        StringBuffer textRead = new StringBuffer();
        while (res != null) {
            textRead.append(res);
            res = fileInputStream.readLine();
        }
        fileInputStream.close();
        System.out.println(textRead);
        String textReadToString = textRead.toString().trim();
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(textReadToString);
        Set<String> num = new TreeSet<String>();
        int i =0;
        System.out.print("Все числа из текста: ");
        while (matcher.find()) {
            num.add(matcher.group());
            System.out.print(matcher.group() + " ");
            i = i +Integer.parseInt( matcher.group());
        }
        System.out.println("\nСумма чисел "+i);
        System.out.println("Только уникальные числа "+num);
    }
}

