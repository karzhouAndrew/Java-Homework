package strings;

import java.util.Scanner;

public class Unit16 {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        //System.out.println("Введите жедаемый текст, для проверки знаков препинания: ");
        // Сканер чет не работает =(
        String text = "As one of the most popular languages for building web applications, Java is often the first language that programmers learn to use. This self-paced book-and-video combination is an ideal introduction to the world of programming with Java. With it and the Java Development Kit, you can compile your first program. Assuming little or no programming experience, the easy-to-follow lessons are reinforced by step-by-step instructions on the DVD that demonstrate how to execute each task, allowing you to master Java programming quickly and seamlessly.";
        char space;
        int n = 0;
        for (int i = 0; i < text.length(); i++) {
            space = text.charAt(i);
            if (space == ' ') {
                n++;
            }
        }
        System.out.println("Количество пробелов в веденном тексте равно: " + n);
    }
}
