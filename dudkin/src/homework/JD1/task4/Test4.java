package homework.JD1.task4;

public class Test4 {
    public static void main(String[] args) {
        float length = 6;
        float width = 8;
        float radius = 6;
        float x = length / 2 * length / 2 + width / 2 * width / 2;
        if (radius * radius >= x) {
            System.out.println("Можно");
        } else {
            System.out.println("Нельзя");
        }

    }
}
