package homework.work6.Task3;

/**
 * Создать класс и объекты описывающие промежуток времени. Сам
 * промежуток в классе должен задаваться тремя свойствами: секундами,
 * минутами, часами. Сделать методы для получения полного количества
 * секунд в объекте, сравнения двух объектов (метод должен работать
 * аналогично compareTo в строках). Создать два конструктора: получающий
 * общее количество секунд, и часы, минуты и секунды по отдельности.
 * Сделать метод для вывода данных. Прочее на ваше усмотрение.
 */
public class Main {
    public static void main(String[] args) {

        Time time = new Time(2863);
        System.out.println(time.toString());

        if (time.compareSec(43) == true) {
            System.out.println("compare=true");
        } else System.out.println("compare=false");

        if (time.compareMin(43) == true) {
            System.out.println("compare=true");
        } else System.out.println("compare=false");
    }
}
