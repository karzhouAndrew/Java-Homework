package workbook.lab22;

/**
 * Created by vasilevich on 12.03.2015.
 * Создать класс и объекты оисывающие промежуток времени. Сам промежуток времени должен описываться секундами минутами и часами.
 * Сделать методы для полуения подного количества секунд в объекте, срвнения двух объектов. Создать 2 конструктора: олучающий общее
 * количества секунд, и часы, минуты и секунды по отдельности. Сделать метод для вывода данных.
 */
public class TimeLibTest {
    public static void main(String[] args) {
        TimerLib timerLib = new TimerLib(250);
        System.out.println("Total = " + timerLib.getTotalSecons());
        System.out.println("Compare to 240 = " + timerLib.compareTo(240));
        System.out.println("Compare to 260 = " + timerLib.compareTo(260));

        TimerLib timerLib1 = new TimerLib(25, 34, 1);
        System.out.println("Total = " + timerLib1.getTotalSecons());
        System.out.println("Compare to 2400 = " + timerLib1.compareTo(240));
        System.out.println("Compare to 2600 = " + timerLib1.compareTo(260));
    }
}
