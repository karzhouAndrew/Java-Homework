package workbook.lab18;

public class LastLetters {
    public static void main(String[] args) {
        String str = "Java technology allows you to work and play in a secure computing environment";
        WordFrom Obj = new WordFrom(str);
        Obj.lastLetters();
        System.out.println(Obj.getTotal());
    }
}
