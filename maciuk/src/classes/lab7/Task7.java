package classes.lab7;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 В файле, содержащем фамилии студентов и их оценки, записать прописными буквами фамилии тех студентов, которые имеют
 оценку выще 7.
 */
public class Task7 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = null;
        BufferedWriter out = null;
        try {
            in = new BufferedReader(new FileReader("listPuple.txt"));
            out = new BufferedWriter(new FileWriter("out.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                Pattern pattern = Pattern.compile("[0-9]");
                Matcher matcher = pattern.matcher(str);
                while (matcher.find()) {
                    int j = matcher.start();
                    char[] myChar = str.toCharArray();
                    int k = Character.getNumericValue(myChar[j]);
                    if (k >= 7) {
                        out.write(myChar + "\r" + "\n");
                        System.out.println(myChar);
                    }
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }

        }
    }
}
