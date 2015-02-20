package blinov.lab12;

import java.util.Scanner;

/**
 * Из текста удалить все слова заданной длины, начинающиеся на согласную букву
 */
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the size of the words - ");
        Scanner in = new Scanner(System.in);
        int wordSize = in.nextInt();
        StringBuilder wordSizeString = new StringBuilder();
        for (int i = 1; i < wordSize; i++) {
            wordSizeString.append("\\w");
        }
        String str = new String("Edit the Expression & Text to see matches. Roll over matches uasdi, or the expression for details. Undo mistakes with ctrl-z. Save & Share expressions with friends or the Community. A full Reference & Help is available in the Library, or watch the video Tutorial.");
        System.out.println(str);
        String newStr = new String();
        newStr = str.replaceAll("\\b[QWRTPSDFGHJKLZXCVBNMwqrtpsdfghjklzxcvbnm]" + wordSizeString + "\\b", "");
        System.out.println(newStr);
    }
}
