package workbook.lab21;

/**
 * Created by Natashka on 17.02.2015.
 */
public class TagReplaceTest {
    public static void main(String[] args) {
        String str = "<pgf> <p id=\"fgr123\"> <p font=20 color=\"red\"> < p >";
        TagReplace tagReplace = new TagReplace(str);
        str = tagReplace.tagReplace();
        System.out.println(str);
    }
}
