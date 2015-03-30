package workbook.streams.task13;
// Записать в двоичный файл 20 случайных чисел. Прочитать этот файл, распечатать числа и их среднее арифметическое.
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("binary.dat"));
        DataInputStream dis = new DataInputStream(new FileInputStream("binary.dat"));
        int quantity = 20;
        double sum = 0;

        for (int i = 0; i < quantity; i++) {
            dos.writeInt((int)(Math.random()*10));
        }
        while (true) {
            try {
                int num = dis.readInt();
                System.out.print(num + " ");
                sum += num;
            } catch (EOFException e) {
                break;
            }
        }
        System.out.println("\nСреднее арифметическое: " + sum / quantity);
        dos.close();
    }
}
