package homework.JD1.task7;

public class Test7 {
        public static void main(String[] args) {
        int number = 2347;
        int d = number % 10;
        int newNumber = number / 10;
        int c = newNumber % 10;
        newNumber /= 10;
        int b = newNumber % 10;
        int a = newNumber / 10;
        if(a != b && a != c && a != d && b != c && b != d && c != d) {
            System.out.println("Верно");
        } else {
            System.out.println("Не верно");
        }

    }
}
