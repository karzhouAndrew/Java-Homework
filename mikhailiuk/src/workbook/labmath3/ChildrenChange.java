package workbook.labmath3;

/**
 * Created by Natashka on 17.02.2015.
 */
public class ChildrenChange {
    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    public String childrenChange() {
        return str.replace("child", "children");
    }
}
