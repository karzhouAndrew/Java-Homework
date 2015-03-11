package homework.work8.Task10;

import java.util.*;

/**
 * Имеется текст. Следует составить для него частотный словарь.
 */
public class Task10 {
    public static void main(String arg[]) {
        Map<String, Integer> hm = new HashMap<String, Integer>();
        String str="Для облегчения работы с ошибками, большинство современных языков имеют механизм исключений. Исключительным состоянием назы-вается состояние программы, когда она не может продолжать выполнение данного фрагмента кода, и необходимо передать управление фрагменту, который может выполнить необходимые в данном случае действия.";
        StringTokenizer tokenizer = new StringTokenizer(str, "— .\t\n\r!@#$%^>&*()_|+-=`~][{}';?/,");//Убрать все ненужное
        String[] array = new String[tokenizer.countTokens()];
        for (int i = 0; i<tokenizer.countTokens(); i++){
            array[i] = tokenizer.nextToken();
        }
        tokenizer = new StringTokenizer(str, "— .\t\n\r!@#$%^>&*()_|+-=`~][{}';?/,");//Убрать все ненужное
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            int count = 1;
            for (int i = 0; i<tokenizer.countTokens(); i++){
                if (word.equalsIgnoreCase(array[i]))
                    count++;
            }
            hm.put(word, count);
        }
        System.out.println(hm);
    }
}
