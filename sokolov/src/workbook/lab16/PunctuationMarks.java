package workbook.lab16;

public class PunctuationMarks {
    public static void main(String[] args) {
        String str = "Мне кажется, что? я прекрасно справился с заданием," +
                " правда, некоторые знаки типо - и / в этом тексте редки, а ()" +
                " я считал как 2 знака пунктуации: думаю так правильнее!";
        Manipulation Obj = new Manipulation(str);
        System.out.println(Obj.getNumber() + " punctuation marks in line.");
    }
}
