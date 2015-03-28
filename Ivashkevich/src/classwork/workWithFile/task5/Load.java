package classwork.workWithFile.task5;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Leonid on 11.03.2015.
 */
public class Load {

    private static final String FILE_PATH = "c:\\work\\Intellij\\Java-Homework\\journal\\Test.txt";
    private static final String FILE_PATH_2= "c:\\work\\Intellij\\Java-Homework\\journal\\Test2.txt";

    public static void main(String[] args) throws IOException {

        File fileDirect = new File("c:\\work\\Intellij\\Java-Homework\\journal\\");
        if (fileDirect.mkdirs()) {
            File file = new File(FILE_PATH);
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileWriter journal;
        try {
            journal = new FileWriter(FILE_PATH);
        } catch (IOException e) {
            return;
        }
        journal.write("Петров 8 9 7,\r\nСидоров 10 7 7,\r\nИванов 4 5 7");
        journal.close();

        BufferedReader fileInputStream = new BufferedReader(new FileReader(FILE_PATH));
        String res = fileInputStream.readLine();
        StringBuffer textRead = new StringBuffer();
        while (res != null) {
            textRead.append(res);
            res = fileInputStream.readLine();
        }
        fileInputStream.close();
        System.out.println(textRead);
        String textReadToString = textRead.toString();
        List<String> studentList =new ArrayList<String>();
        Pattern pattern = Pattern.compile("[0-9]+");
        int average;
        int summ = 0;
        int i = 0;
        for (String student : textReadToString.split("[,]+")) {
            Matcher matcher = pattern.matcher(student);
            while (matcher.find()) {
                i++;
                summ = summ + Integer.parseInt(matcher.group());
            }
            average = summ / i;

            if (average>7){
                studentList.add(student.toUpperCase());
            }
            else{
                studentList.add(student);
            }
        }
        System.out.println(studentList);
        FileWriter journal2;
        try {
            journal2 = new FileWriter(FILE_PATH_2);
        } catch (IOException e) {
            return;
        }
        journal2.write(studentList.toString());
        journal2.close();
    }
}

