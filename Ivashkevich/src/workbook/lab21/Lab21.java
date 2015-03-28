package workbook.lab21;

/*
 * Написать программу, выполняющую поиск в строке всех тегов абза-цев, в т.ч. тех, у
 * которых есть параметры, например <p id=”p1”>, и замену их на простые теги абзацев <p>.
 */
public class Lab21 {

    public static void main(String[] args) {
        String tag = "p";
        String text = "<p   > <pi > <i> <p p> <p kh>vds</p> sdf</p> <p id=\"p1\"> <p id=\"p1\" name=\"MyP\"> ";
        System.out.println(text + "\n" + text.replaceAll("<" + tag + " +.*?>", "<" + tag + ">"));
    }
}



