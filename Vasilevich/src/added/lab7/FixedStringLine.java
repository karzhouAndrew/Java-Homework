package added.lab7;

/**
 * Created by Sam on 21.02.2015.
 * Заменить в строке все вхождения 'child' на 'children'. Удалить из текста все
 символы, являющиеся цифрами.
 */
public class FixedStringLine {
    public static void main(String[] args) {
        String str = "123_child_133_children__chi0ld_8childish_childhood";
        String strResult = str.replaceAll("\\d", "");
        strResult = strResult.replaceAll("child[^a-z]+", "children");
        System.out.println(strResult);
    }
}
