package workbook.lab16;

public class PunctuationMarks {
    public static void main(String[] args) {
        String string = "Мне кажется, что? я прекрасно справился с заданием," +
                " правда, некоторые знаки типо - и / в этом тексте редки, а ()" +
                " я считал как 2 знака пунктуации: думаю так правильнее!";
        Manipulation obj = new Manipulation(string);
        System.out.println(obj.getNumber() + " punctuation marks in line.");
    }
}
